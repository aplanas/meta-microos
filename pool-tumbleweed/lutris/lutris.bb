SUMMARY = "Manager for game installation and execution"
DESCRIPTION = "Lutris allows to gather and manage (install, configure and launch) \
all games acquired from any source, in a single interface. \
This includes, for example, Steam or GOG games, Windows games (WINE), \
or emulated console games and browser games."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.13"

RPM_NAME = "lutris-0.5.13-1.1.noarch.rpm"
RPM_HASH = "b72f60945e48dbf8b60d93096a5958d0113e51b1afad00d686a3efa2588e756a34354155eb05430e757aaa9c44dff2ba7a6ba03a917237145a398f8d2fe3755c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lutris \
python3.10dist-lutris \
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
