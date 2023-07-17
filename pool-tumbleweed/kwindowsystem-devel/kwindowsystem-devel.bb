SUMMARY = "KDE Access to window manager: Build Environment"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kwindowsystem-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "a1cd9edc2f0d3cb7c40e8b484a3ee5892bd77172a6dd1757d0cb1a93774f580c9584ad121b2eb7afa150324027d0ea71ef42654bbe43a09f1923f0ccb295529e"

RPROVIDES:${PN} += "cmake-KF5WindowSystem \
kwindowsystem-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5WindowSystem5 \
pkgconfig-x11 \
pkgconfig-xcb"

inherit rpm
