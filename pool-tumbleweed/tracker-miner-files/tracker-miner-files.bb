SUMMARY = "Tracker miner to index files and applications"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This package contains a miner to index files and applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.2"

RPM_NAME = "tracker-miner-files-3.5.2-3.1.aarch64.rpm"
RPM_HASH = "58f1c5f24bf8cb795d8d02f7c242f0cceb2cf716502e289afa35f0cab8f83427615d4a9b21c5bc48c23d89712ff4d4888cdf73e7c7f23c3a01fe76af104df161"

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
