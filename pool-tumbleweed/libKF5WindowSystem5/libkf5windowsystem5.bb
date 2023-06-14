SUMMARY = "KDE Access to window manager"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5WindowSystem5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "9f3e7c44f96250be2572ac26c79f3abf672e4508df2153bace676a23ed05e48097686983e93440f940a12f3b3b49275a43843a240d53a3515e5cf0378b010702"

RPROVIDES:${PN} += "libKF5WindowSystem.so.5 \
libKF5WindowSystem5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQt5X11Extras.so.5 \
libQt5X11Extras5 \
libX11.so.6 \
libXfixes.so.3 \
libc.so.6 \
libstdc++.so.6 \
libxcb-keysyms.so.1 \
libxcb-res.so.0 \
libxcb.so.1"

inherit rpm
