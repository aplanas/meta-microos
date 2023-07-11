SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-arm-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "76b3c38851f06e655ac79978896e66987650f1fee74acc4a3f503ad8f43fd7bbbe929cc67ea2a83500b1af8dd60c8876c85a525a9b56ec9663ce6132ce21c8d5"

RPROVIDES:${PN} += "cross-arm-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
