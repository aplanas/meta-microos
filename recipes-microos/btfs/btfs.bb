SUMMARY = "A BitTorrent file system based on FUSE"
DESCRIPTION = "With BTFS, you can mount any .torrent file or magnet link and then use it as \
any read-only directory in your file tree. The contents of the files will be \
downloaded on-demand as they are read by applications. Tools like ls, cat and \
cp work as expected. Applications like media players can also work without changes."
LICENSE = "GPL-3.0-or-later"

PV = "2.24"

RPM_NAME = "btfs-2.24-1.10.aarch64.rpm"
RPM_HASH = "1e18aa6b4a0378c1fff6d9695289616bd092ae19f8d62884b0a464cce16d7a775da1793c0cb913b8b95322259f4f5ae6583de6821234e10707d27843d0567d82"

RPROVIDES:${PN} += "btfs btfs(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.8)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libtorrent-rasterbar.so.2.0()(64bit)"

inherit rpm
