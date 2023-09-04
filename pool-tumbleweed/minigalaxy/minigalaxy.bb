SUMMARY = "A GOG client for Linux that lets you download and play your GOG Linux games"
DESCRIPTION = "A GOG client for Linux that lets you download and play your GOG Linux games."
LICENSE = "GPL-3.0-only"

PV = "1.2.5"

RPM_NAME = "minigalaxy-1.2.5-1.1.noarch.rpm"
RPM_HASH = "3df2dc0972793e4aaefdf6b4a99dba4a4efe91595970c558e2346c581d4f72e4affffbcee02feac8892534c62cc1a507ef856fcc51c215ace21b1be1d34e4f49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minigalaxy \
python3.11dist-minigalaxy \
python3dist-minigalaxy"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject \
python3-gobject-Gdk \
python3-requests \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
typelib-WebKit2"

inherit rpm
