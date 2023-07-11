SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a KDE Plasma 5 workspace. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma5-workspace-devel-5.27.6-2.1.aarch64.rpm"
RPM_HASH = "8f1218fdb4a1acd888331d9b3f97afb39d7380d593d1e7789eda9a13540a592da7d0fd47fe2ba6cd1b19e423d9c7479b884d00b345e2dbbbce4941a65d4ad505"

RPROVIDES:${PN} += "cmake-KRunnerAppDBusInterface \
cmake-KSMServerDBusInterface \
cmake-LibColorCorrect \
cmake-LibKWorkspace \
cmake-LibNotificationManager \
cmake-LibTaskManager \
plasma-workspace5-devel \
plasma5-workspace-devel"

RDEPENDS:${PN} += "cmake-KF5SysGuard \
cmake-KF5Wayland \
cmake-Qt5Core \
cmake-Qt5Gui \
cmake-Qt5Quick \
plasma5-workspace-libs"

inherit rpm
