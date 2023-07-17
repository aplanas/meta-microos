SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-arm-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "1dd6e43524fa2c2fc597aaa660fdc1197535691b5650c64a46ecc3d2a9b3a33baa2f316055b185c7717eecd55f9cc743f5e5e611037f53f56646fca2efc04a76"

RPROVIDES:${PN} += "cross-arm-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
