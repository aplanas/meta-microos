SUMMARY = "Python Bindings for libtorrent-rasterbar"
DESCRIPTION = "Python Bindings for the libtorrent-rasterbar package."
LICENSE = "BSD-3-Clause"

PV = "2.0.9"

RPM_NAME = "python3-libtorrent-rasterbar-2.0.9-1.1.aarch64.rpm"
RPM_HASH = "67815ab76657a0f814feb82b61a3fe1340761d0410dff37bb2f54db2df618532a3078b9d5dce9784aef983b654341523edbdf4156d98daa394430fe002d52e1d"

RPROVIDES:${PN} += "libtorrent.cpython-310-aarch64-linux-gnu.so()(64bit) \
python3-libtorrent-rasterbar \
python3-libtorrent-rasterbar(aarch-64) \
python3.10dist(libtorrent) \
python3dist(libtorrent)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_python-py3.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libtorrent-rasterbar.so.2.0()(64bit) \
python(abi)"

inherit rpm
