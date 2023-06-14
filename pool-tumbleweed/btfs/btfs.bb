SUMMARY = "A BitTorrent file system based on FUSE"
DESCRIPTION = "With BTFS, you can mount any .torrent file or magnet link and then use it as \
any read-only directory in your file tree. The contents of the files will be \
downloaded on-demand as they are read by applications. Tools like ls, cat and \
cp work as expected. Applications like media players can also work without changes."
LICENSE = "GPL-3.0-or-later"

PV = "2.24"

RPM_NAME = "btfs-2.24-1.10.aarch64.rpm"
RPM_HASH = "1e18aa6b4a0378c1fff6d9695289616bd092ae19f8d62884b0a464cce16d7a775da1793c0cb913b8b95322259f4f5ae6583de6821234e10707d27843d0567d82"

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
