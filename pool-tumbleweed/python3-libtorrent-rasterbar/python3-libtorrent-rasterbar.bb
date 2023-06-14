SUMMARY = "Python Bindings for libtorrent-rasterbar"
DESCRIPTION = "Python Bindings for the libtorrent-rasterbar package."
LICENSE = "BSD-3-Clause"

PV = "2.0.9"

RPM_NAME = "python3-libtorrent-rasterbar-2.0.9-1.1.aarch64.rpm"
RPM_HASH = "67815ab76657a0f814feb82b61a3fe1340761d0410dff37bb2f54db2df618532a3078b9d5dce9784aef983b654341523edbdf4156d98daa394430fe002d52e1d"

RPROVIDES:${PN} += "libtorrent.cpython-310-aarch64-linux-gnu.so \
python3-libtorrent-rasterbar \
python3.10dist-libtorrent \
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
