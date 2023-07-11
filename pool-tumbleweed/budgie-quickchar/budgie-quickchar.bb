SUMMARY = "Quickchar applet"
DESCRIPTION = "QuickChar is a mini-app to quickly choose and insert equivalents of ascii characters. \
QuickChar is activated via the Budgie Menu."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-quickchar-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "3cd422e2325bd92e2c0bd2be8429e96e4702be7d640040c2527e2dae252a999230ce24c483e31efde42ae9eb13869ee5afc5c0036ad723a57dbc3cc19bb5acc6"

RPROVIDES:${PN} += "budgie-quickchar"

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
