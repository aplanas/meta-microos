SUMMARY = "Remaining Software"
DESCRIPTION = "Packages that are on CD but not in other patterns."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-media-rest_cd_core-20170319-43.1.aarch64.rpm"
RPM_HASH = "bfe5f3c1bcb117fbea75800def4642564fd3ddeab29ed5fd28dc3cc99c1f4c1131ed29e5e657639a423cc480d1be1d8d3c786fa2b280a07734e962a361d0ce86"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-media-rest-cd-core"

RDEPENDS:${PN} += "kernel-default \
kernel-firmware \
pattern- \
yast2-bootloader \
yast2-country \
yast2-hardware-detection \
yast2-network \
yast2-proxy \
yast2-qt-branding-openSUSE \
yast2-storage-ng \
yast2-trans-stats \
yast2-x11"

inherit rpm
