SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-arm-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "1898f84abbe6a17f266277ceabc926795cff77cefa54899e578d5b599199a83b3b568c87f5d66186cd729fa3c35b2fe223534bead0cdc47346ea527e4662f4d5"

RPROVIDES:${PN} += "cross-arm-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
