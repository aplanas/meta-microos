SUMMARY = "Manager for game installation and execution"
DESCRIPTION = "Lutris allows to gather and manage (install, configure and launch) \
all games acquired from any source, in a single interface. \
This includes, for example, Steam or GOG games, Windows games (WINE), \
or emulated console games and browser games."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.13"

RPM_NAME = "lutris-0.5.13-2.1.noarch.rpm"
RPM_HASH = "9f6a928d14243649c3f0d3003c1c2e527dfd18dd01945b5b1dfd13fc19ce90d7600e50cf0986b71fc451d5384dd400311d4bef79f0864226e2ef8fe5722beff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lutris \
python3.11dist-lutris \
python3dist-lutris"

RDEPENDS:${PN} += "/usr/bin/python3 \
cabextract \
curl \
fluid-soundfont-gm \
p7zip \
psmisc \
python-abi \
python3-Pillow \
python3-PyYAML \
python3-cssselect \
python3-dbus-python \
python3-evdev \
python3-gobject \
python3-gobject-Gdk \
python3-lxml \
python3-requests \
typelib-AppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-GnomeDesktop \
typelib-Gtk \
typelib-Pango \
typelib-WebKit2 \
xrandr"

inherit rpm
