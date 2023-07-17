SUMMARY = "KDE Access to window manager"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5WindowSystem5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "dc3ff1dc5cf24ff45cf96fe0689a8876a68cb6844772ac44508ffdd86eeb3d4f2fe8ff00da400bb18dbb6e0ad0756e94782eca1ab59a7c2bca470f47287b95c6"

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
