SUMMARY = "Quickchar applet"
DESCRIPTION = "QuickChar is a mini-app to quickly choose and insert equivalents of ascii characters. \
QuickChar is activated via the Budgie Menu."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-quickchar-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "dfbd8c12e68578294a9e1e9c718924150f8af02ff5da544605ab60e51a6e35c68987390c78aff15bfd01f0b47ff3b2bcce3e21d1a052efd41a039e0315f2e30c"

RPROVIDES:${PN} += "application() \
application(org.ubuntubudgie.quickchar.desktop) \
budgie-quickchar \
budgie-quickchar(aarch-64) \
metainfo() \
metainfo(org.ubuntubudgie.quickchar.metainfo.xml)"
RDEPENDS:${PN} += "/usr/bin/python3 \
budgie-extras-daemon \
python3-gobject-Gdk \
python3-pyperclip \
python3-python-xlib \
wmctrl \
xdpyinfo \
xev \
xlsatoms \
xlsclients \
xlsfonts \
xprop \
xvinfo \
xwininfo"

inherit rpm
