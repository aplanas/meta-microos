SUMMARY = "Tracker miner to index files and applications"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This package contains a miner to index files and applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.2"

RPM_NAME = "tracker-miner-files-3.5.2-1.3.aarch64.rpm"
RPM_HASH = "d0dea060821c2625b83c8bb84ecb61818f827bc97e8dbfd4cbe785235838db14115c83f04ffcc564d2aab87b505a298e6f854a576ec05b06d1f5c15aa6765dd4"

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
