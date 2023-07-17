SUMMARY = "Development package for kirigami"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kirigami2-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e44111536b782e923909a1f061dca245bdb264bb24417827fa95c556ea22ed7ed3d68889ce307b7fdc7c6058a51d75b6c2f168ff4c39b669ea1f1d93e6d11e00"

RPROVIDES:${PN} += "cmake-KF5Kirigami2 \
kirigami2-devel"

RDEPENDS:${PN} += "kirigami2 \
libKF5Kirigami2-5"

inherit rpm
