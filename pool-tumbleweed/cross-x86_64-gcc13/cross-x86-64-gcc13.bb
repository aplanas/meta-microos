SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-x86_64-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "e5df2384c13d026d6520ad1d7215f32bc95cd0bab4dc8f5ce723970558a4d4af2b78b243cfa236998297bda5ab13a16dc4a3545af5c711b2af7f646b1120ecd6"

RPROVIDES:${PN} += "cross-x86-64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-x86-64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
