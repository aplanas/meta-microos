SUMMARY = "User and system idle time reporting singleton"
DESCRIPTION = "KIdleTime is a singleton reporting information on idle time. It is useful not \
only for finding out about the current idle time of the PC, but also for getting \
notified upon idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5IdleTime5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "7e5c9c653ea78f81a40147173f0efee6802f5963bfc5e65d92642a8dde254f9bfa973f97aefa98937801ae9c8a671b6df1430673ac15633244e9901b3e402e2b"

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
