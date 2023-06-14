SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "frameworkintegration-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "0ea982bec80c48ddbb60dd4a18e5a1029dd45300ab34acdb98441a0f16952e4bac23bd892b690cdac03842c7a6c06c6e3a8f3b6734e925bab27ff766294f9f58"

RPROVIDES:${PN} += "cmake-KF5FrameworkIntegration \
frameworkintegration-devel"

RDEPENDS:${PN} += "cmake-KF5ConfigWidgets \
cmake-KF5IconThemes \
extra-cmake-modules \
libKF5Style5"

inherit rpm
