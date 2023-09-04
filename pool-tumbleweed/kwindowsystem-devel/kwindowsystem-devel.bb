SUMMARY = "KDE Access to window manager: Build Environment"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kwindowsystem-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "78351a0391f03dd3eaecc57687864b4fda023d303db7d9f83924b1b0acb87e90e2d9e0e7fec7fbf63b7162c7a5149c72edd92b4c18c33a7cd39005b60c9b1618"

RPROVIDES:${PN} += "cmake-KF5WindowSystem \
kwindowsystem-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5WindowSystem5 \
pkgconfig-x11 \
pkgconfig-xcb"

inherit rpm
