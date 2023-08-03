SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-mips-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "9c98b3c5434d51fd88c4d54e14ce02c93c5bede532b69747922b2cb40b78e89c9aaea9bd1da41a6813609fb6a0c9f3d0c0d4256eac2c2f33d4fb6664cec27f73"

RPROVIDES:${PN} += "cross-mips-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-mips-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
