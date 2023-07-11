SUMMARY = "Manager for game installation and execution"
DESCRIPTION = "Lutris allows to gather and manage (install, configure and launch) \
all games acquired from any source, in a single interface. \
This includes, for example, Steam or GOG games, Windows games (WINE), \
or emulated console games and browser games."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.13"

RPM_NAME = "lutris-0.5.13-1.2.noarch.rpm"
RPM_HASH = "48ef77764572bba0ca1e72401ce5db4a856b9c9082fdf971234f5f794e80b2a7fdf10d9c8a0a25ebe2f8bcaa4a25a867db778022a73ac1f5c81b3a44056d254a"
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
