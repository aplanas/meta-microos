SUMMARY = "Qt 6 MultimediaQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimediaquick-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b5566394d73e8ba72dee4a319a5d809866b572a1b87cb98cec51cc1b16641beae50c8b6c2a3dd9313eb71017796af6288592f1b7f0c804cb9a647b12a5135389"

RPROVIDES:${PN} += "cmake-Qt6MultimediaQuickPrivate \
qt6-multimediaquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Multimedia \
cmake-Qt6Quick \
libQt6MultimediaQuick6 \
qt6-multimedia-private-devel \
qt6-quick-private-devel"

inherit rpm
