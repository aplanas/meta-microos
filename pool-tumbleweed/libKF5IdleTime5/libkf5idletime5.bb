SUMMARY = "User and system idle time reporting singleton"
DESCRIPTION = "KIdleTime is a singleton reporting information on idle time. It is useful not \
only for finding out about the current idle time of the PC, but also for getting \
notified upon idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5IdleTime5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "83b94f6f65e38c4f9b37aa0f2f26189d149625173b1179147e85e82142374e2bc71c92caba5dbc06837405522c3588709754563f077273c2808efa776c53359b"

RPROVIDES:${PN} += "libKF5IdleTime.so.5 \
libKF5IdleTime5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5WaylandClient.so.5 \
libQt5Widgets5 \
libQt5X11Extras.so.5 \
libQt5X11Extras5 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libXss.so.1 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-sync.so.1 \
libxcb.so.1"

inherit rpm
