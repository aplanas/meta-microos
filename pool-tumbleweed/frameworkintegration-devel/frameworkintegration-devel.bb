SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "frameworkintegration-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "c31b09c989b40f10844e8d8c4d1db3ba428e474902227fd1205822a8c0efa5c0105aecb3618e7d1fde4ead43aada8b71e08c86a8236eff1866190bbcacb8a80d"

RPROVIDES:${PN} += "cmake-KF5FrameworkIntegration \
frameworkintegration-devel"

RDEPENDS:${PN} += "cmake-KF5ConfigWidgets \
cmake-KF5IconThemes \
extra-cmake-modules \
libKF5Style5"

inherit rpm
