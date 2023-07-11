SUMMARY = "A BitTorrent file system based on FUSE"
DESCRIPTION = "With BTFS, you can mount any .torrent file or magnet link and then use it as \
any read-only directory in your file tree. The contents of the files will be \
downloaded on-demand as they are read by applications. Tools like ls, cat and \
cp work as expected. Applications like media players can also work without changes."
LICENSE = "GPL-3.0-or-later"

PV = "2.24"

RPM_NAME = "btfs-2.24-1.11.aarch64.rpm"
RPM_HASH = "0f6af4d4f889cf574e6be0448443e1b4a1ad35761b1cbb20a4f80106894de0fe90f817c574c40aca2f1a2655bb5f3136a4eef61df7a56e1895ad1c9a1283a2bc"

RPROVIDES:${PN} += "btfs"

RDEPENDS:${PN} += "/usr/bin/python3 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfuse.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtorrent-rasterbar.so.2.0"

inherit rpm
