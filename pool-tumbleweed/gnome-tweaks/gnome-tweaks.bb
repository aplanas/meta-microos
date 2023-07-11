SUMMARY = "A tool to customize advanced GNOME 3 options"
DESCRIPTION = "GNOME Tweak Tool is an application for changing the advanced settings \
of GNOME 3."
LICENSE = "CC0-1.0 & GPL-3.0-or-later"

PV = "42.beta+60"

RPM_NAME = "gnome-tweaks-42.beta+60-1.2.noarch.rpm"
RPM_HASH = "df7550400533efbc2a75c4704d19e5ae3d1465f96324a29e68c73e4353d4993560f1a16b9d34587e5a9bb431bcc51b64776abe372646cb79d4e74ee7bccadd54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-tweak-tool \
gnome-tweaks"

RDEPENDS:${PN} += "/usr/bin/python3 \
gnome-settings-daemon \
gnome-shell \
gsettings-desktop-schemas \
mutter \
python-abi \
python3-gobject \
python3-gobject-Gdk \
python3-xml \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-GnomeDesktop \
typelib-Gtk \
typelib-Handy \
typelib-Notify \
typelib-Pango"

inherit rpm
