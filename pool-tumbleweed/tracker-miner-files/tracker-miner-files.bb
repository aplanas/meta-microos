SUMMARY = "Tracker miner to index files and applications"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This package contains a miner to index files and applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.2"

RPM_NAME = "tracker-miner-files-3.5.2-1.2.aarch64.rpm"
RPM_HASH = "18e71b444a5c9f0017978cf1dea811a11a7df11b9dcc5c2ac1d9028ea9f43794750b762ca94e2ff09fd6415057cbc63fb120c7ce427059e6ae666b8402e104b9"

RPROVIDES:${PN} += "tracker-miner-files"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtracker-extract.so \
libtracker-sparql-3.0.so.0 \
libupower-glib.so.3 \
tracker-miners"

inherit rpm
