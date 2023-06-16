SUMMARY = "Development files for the Tracker indexer"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This subpackage contains the headers to make use of its libraries."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.3"

RPM_NAME = "tracker-devel-3.5.3-1.1.aarch64.rpm"
RPM_HASH = "37468893fe236e60ceb65ef4aaee7e9d15a7e7a6d595fd43058e5b64193b37bf3c75efa3dc0b5a5a34a0b6ad736728b616bdb4acf88797b1504210f472c90638"

RPROVIDES:${PN} += "pkgconfig-tracker-sparql-3.0 \
pkgconfig-tracker-testutils-3.0 \
tracker-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libtracker-sparql-3-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libxml-2.0 \
pkgconfig-sqlite3 \
typelib-1-0-Tracker-3-0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Tracker"

inherit rpm
