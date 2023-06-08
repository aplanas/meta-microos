SUMMARY = "Daemon handling the DDE session settings"
DESCRIPTION = "Deepin Daemon is a daemon for handling the deepin session settings"
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-5.14.45-2.3.aarch64.rpm"
RPM_HASH = "03962194157616b941632295dbe3863a235933c22eb6253469739d318f7fb1b3fa4810b6b2c3698effdf083ded20e4c46a12e99163acf9ab66288835c5b384eb"

RPROVIDES:${PN} += "deepin-daemon deepin-daemon(aarch-64)"
RDEPENDS:${PN} += "/bin/sh acpid gvfs iw libgdk_pixbuf_xlib-2_0-0 rfkill upower wallpaper-branding-openSUSE xdotool xvfb-run"

inherit rpm
