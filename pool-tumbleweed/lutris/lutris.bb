SUMMARY = "Manager for game installation and execution"
DESCRIPTION = "Lutris allows to gather and manage (install, configure and launch) \
all games acquired from any source, in a single interface. \
This includes, for example, Steam or GOG games, Windows games (WINE), \
or emulated console games and browser games."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.13"

RPM_NAME = "lutris-0.5.13-3.1.noarch.rpm"
RPM_HASH = "550a8f773dec90d1438ece1e9775d1d3bc1ed292f1c1badbdad5b0ba5f7e2e0c23289b11e94afaee0501b321a4b437c25ccce6b5329d6a8c5ca460efb823a51e"
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
