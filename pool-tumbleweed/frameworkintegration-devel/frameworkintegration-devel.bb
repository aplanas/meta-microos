SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "frameworkintegration-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "3003ffb85e48c96c21f5a7a5b8503ba563f030bfadd14d5d820a962e20e22916632e80ef9c3221a447d7072c30522e7f190ec15ba4630cd00bd72efcdb243a04"

RPROVIDES:${PN} += "cmake-KF5FrameworkIntegration \
frameworkintegration-devel"

RDEPENDS:${PN} += "cmake-KF5ConfigWidgets \
cmake-KF5IconThemes \
extra-cmake-modules \
libKF5Style5"

inherit rpm
