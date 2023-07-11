SUMMARY = "KDE Access to window manager"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5WindowSystem5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "7d1cdead16f862e3360e2fa05b034bcc0e75628bc92618cd25d44fdf1430b7fac9bc2a6a40cc4098c6685f409b3ffd7624f3beee5d54528d802776267972209b"

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
