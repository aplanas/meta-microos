SUMMARY = "LXQt Session Manager"
DESCRIPTION = "lxqt-session is the standard session manager used by LXQt. The lxqt-session manager \
is used to automatically start a set of applications and set up a working desktop \
environment. Moreover, the session manager is able to remember the applications in \
use when a user logs out and to restart them the next time the user logs in."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-session-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "340e6ab7a69f7d767d661e09f5019c193c64f331cdecbb858b2f807b669359891ae0da326ba103761e7d60b5703e8dd1162108c5980f03863c280f47276542f5"

RPROVIDES:${PN} += "config-lxqt-session \
lxqt-session"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xdg.so.3 \
libX11.so.6 \
libc.so.6 \
liblxqt.so.1 \
libprocps.so.8 \
libstdc++.so.6 \
libudev.so.1 \
qtxdg-tools \
update-alternatives"

inherit rpm
