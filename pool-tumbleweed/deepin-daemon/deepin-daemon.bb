SUMMARY = "Daemon handling the DDE session settings"
DESCRIPTION = "Deepin Daemon is a daemon for handling the deepin session settings"
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-5.14.45-2.5.aarch64.rpm"
RPM_HASH = "2c57ab0b808ad29ba6d35b0d1388b542ab7019c1c4ffcfd2902d3db86273ce237966254ece3aca59322e3ed2ed1a4f24c04fed30d9c8fb9c2c650548f4328937"

RPROVIDES:${PN} += "deepin-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
acpid \
gvfs \
iw \
libgdk-pixbuf-xlib-2-0-0 \
rfkill \
upower \
wallpaper-branding-openSUSE \
xdotool \
xvfb-run"

inherit rpm
