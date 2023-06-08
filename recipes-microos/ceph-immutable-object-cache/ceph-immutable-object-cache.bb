SUMMARY = "Ceph daemon for immutable object cache"
DESCRIPTION = "Daemon for immutable object cache."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "ceph-immutable-object-cache-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "6fdf4d6c2a1ea29590300e8dc9126c3c7b69b73de58c7c5df1bebaf7473cb9b09a91aaa0a2ba8d7a511783d3c957f70eee180d0f5480e2171ba86a23fb21d3cf"

RPROVIDES:${PN} += "ceph-immutable-object-cache ceph-immutable-object-cache(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ceph-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libceph-common.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) librados.so.2()(64bit) librados.so.2(LIBRADOS_14.2.0)(64bit) librados2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
