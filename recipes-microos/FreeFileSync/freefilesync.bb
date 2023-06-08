SUMMARY = "Backup software to synchronize files and folders"
DESCRIPTION = "FreeFileSync is a software that helps synchronizing files \
and folders. It runs backup jobs while having visual \
feedback along the way."
LICENSE = "GPL-3.0-or-later"

PV = "12.0"

RPM_NAME = "FreeFileSync-12.0-1.2.aarch64.rpm"
RPM_HASH = "5798b4d484121bcd107904513941ec6a7e18ac40fc72ae3c7bb0a4a8b13cbedfa0fc0da78a6a564bf2db6ad78b8f15859495c3c87a023e3ff470d3d102d33b26"

RPROVIDES:${PN} += "FreeFileSync FreeFileSync(aarch-64) application() application(FreeFileSync.desktop)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libssh2.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwx_baseu-suse.so.8.0.0()(64bit) libwx_baseu-suse.so.8.0.0(WXU_3.2)(64bit) libwx_gtk3u_aui-suse.so.8.0.0()(64bit) libwx_gtk3u_aui-suse.so.8.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.8.0.0()(64bit) libwx_gtk3u_core-suse.so.8.0.0(WXU_3.2)(64bit) libwx_gtk3u_richtext-suse.so.8.0.0()(64bit) libwx_gtk3u_richtext-suse.so.8.0.0(WXU_3.2)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
