SUMMARY = "Python Bindings for libtorrent-rasterbar"
DESCRIPTION = "Python Bindings for the libtorrent-rasterbar package."
LICENSE = "BSD-3-Clause"

PV = "2.0.9"

RPM_NAME = "python3-libtorrent-rasterbar-2.0.9-1.3.aarch64.rpm"
RPM_HASH = "922bca3d72840c79612c83c802aac933878e489cd808a5f1b69d45846c4269502446510cfbd5792d5bbb60271295770f250c1454909cf35f2a3e81f8552f46fc"

RPROVIDES:${PN} += "libtorrent.cpython-311-aarch64-linux-gnu.so \
python3-libtorrent-rasterbar \
python3.11dist-libtorrent \
python3dist-libtorrent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtorrent-rasterbar.so.2.0 \
python-abi"

inherit rpm
