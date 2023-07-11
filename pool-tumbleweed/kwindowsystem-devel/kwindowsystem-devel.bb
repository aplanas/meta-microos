SUMMARY = "KDE Access to window manager: Build Environment"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kwindowsystem-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "3fdb9fad4ec65ed1bfd4027e8767a47a654e2c95d554d40b5769d75c556be63b71a5a06239c9e348b33c3f7e8f7e3110a690a5d9ba1d5a6c48cee0b0113c5f4f"

RPROVIDES:${PN} += "cmake-KF5WindowSystem \
kwindowsystem-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5WindowSystem5 \
pkgconfig-x11 \
pkgconfig-xcb"

inherit rpm
