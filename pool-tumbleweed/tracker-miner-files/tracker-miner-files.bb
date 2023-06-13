SUMMARY = "Tracker miner to index files and applications"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This package contains a miner to index files and applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.2"

RPM_NAME = "tracker-miner-files-3.5.2-1.2.aarch64.rpm"
RPM_HASH = "18e71b444a5c9f0017978cf1dea811a11a7df11b9dcc5c2ac1d9028ea9f43794750b762ca94e2ff09fd6415057cbc63fb120c7ce427059e6ae666b8402e104b9"

RPROVIDES:${PN} += "tracker-miner-files \
tracker-miner-files(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblkid.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libtracker-extract.so()(64bit) \
libtracker-sparql-3.0.so.0()(64bit) \
libupower-glib.so.3()(64bit) \
tracker-miners"

inherit rpm
