SUMMARY = "LXQt Session Manager"
DESCRIPTION = "lxqt-session is the standard session manager used by LXQt. The lxqt-session manager \
is used to automatically start a set of applications and set up a working desktop \
environment. Moreover, the session manager is able to remember the applications in \
use when a user logs out and to restart them the next time the user logs in."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-session-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "3c8ee80503b7705e507995fa0e2fdd6df060104e589a3c71b4bb7313365a18ef5e165ebd441e3ad4c9c2c2c64a96b105d889ef0779eeb551edd8955d5349ad23"

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
