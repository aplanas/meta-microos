SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a KDE Plasma 5 workspace. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-workspace-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "03f3df11853c0e00331b051d752976da6ec801f778a643fd1c0aa0c51f2fcf61e3b768db1869584027dccd9643450540a4d6c8216ca481992300ad7e7b475230"

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
