SUMMARY = "Daemon handling the DDE session settings"
DESCRIPTION = "Deepin Daemon is a daemon for handling the deepin session settings"
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-5.14.45-2.4.aarch64.rpm"
RPM_HASH = "5f84acf1a86e62b08b662020f17d348f10a1e7e1a0702bdc29985963ba327ef6c10edbe72064df8e08d6a44a8ed35d906abcf75eefe42c2c9201ad526ff6a611"

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
