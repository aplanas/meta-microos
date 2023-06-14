SUMMARY = "Deflate64 compression/decompression library"
DESCRIPTION = "A python package to provide compression and decompression feature with Enhanced Deflate algorithm."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "python310-inflate64-0.3.1-1.5.aarch64.rpm"
RPM_HASH = "c1db6c982d80cebfc9c43b8a41f1a74b0d9026c580a99d9d8a59d752a302640ccbe9f3539bf4b059e1f88727c56db5dc7f0d212633425313b0ebb694a1f62c8d"

RPROVIDES:${PN} += "python3-inflate64 \
python3.10dist-inflate64 \
python310-inflate64 \
python3dist-inflate64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
