SUMMARY = "File Manager for the GNOME Desktop"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "nautilus-44.2-1.1.aarch64.rpm"
RPM_HASH = "8d5cfb71821e6590927b3e05b9b49c81fcfb177e10d0831b13218804ff059e40801055b8fa97f43b1ce0482cbc724ffae79189dfd8668b9c4bc8a088badccbb1"

RPROVIDES:${PN} += "nautilus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libcloudproviders.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnome-autoar-0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libnautilus-extension.so.4 \
libpango-1.0.so.0 \
libportal-gtk4.so.1 \
libportal.so.1 \
libtracker-sparql-3.0.so.0 \
tracker-miner-files"

inherit rpm
