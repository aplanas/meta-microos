SUMMARY = "Framework for creation and generation of reports"
DESCRIPTION = "A framework for creation and generation of reports in multiple formats"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kreport-3.2.0-4.11.aarch64.rpm"
RPM_HASH = "c21eb6793344ab2e2e3b2777f499b57dca6ef691fd6afa3acab6df88c6354575cd2f8f9a1c4243565f875280c5873de326f336d61e0bdc75c9015b7f29940e98"

RPROVIDES:${PN} += "kreport"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKPropertyCore3.so.4 \
libKReport3.so.4 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libmarblewidget-qt5.so.28 \
libstdc++.so.6"

inherit rpm
