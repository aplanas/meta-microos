SUMMARY = "Versatile File Searching Tool"
DESCRIPTION = "Catfish is a GTK+ search utility written in python. Its search is powered by \
/usr/bin/find and /usr/bin/locate, with search suggestions provided by \
zeitgeist."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "catfish-4.18.0-1.1.noarch.rpm"
RPM_HASH = "5744d8c663e64f929f199532bb8e3457385e4547ef96381e94afbad27d5627a126266000df489e9240e411099f218ab9377be83984dc675ac7758036837736ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catfish \
python3.11dist-catfish \
python3dist-catfish"

RDEPENDS:${PN} += "/usr/bin/python3 \
findutils-locate \
gdk-pixbuf-loader-rsvg \
gsettings-backend-dconf \
python-abi \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-pexpect \
python3-xml \
sudo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Xfconf"

inherit rpm
