SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a KDE Plasma 5 workspace. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-workspace-devel-5.27.7-3.1.aarch64.rpm"
RPM_HASH = "ad3ed06c614ddb77bf49d5981baaf3206a347fcbc04049b15baf86ed6b27a969f723a76548191dc03f4bb62961ce0f534a5897793dd533c9786b2deaff35a7ea"

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
