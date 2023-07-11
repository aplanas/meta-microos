SUMMARY = "Deflate64 compression/decompression library"
DESCRIPTION = "A python package to provide compression and decompression feature with Enhanced Deflate algorithm."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "python39-inflate64-0.3.1-2.1.aarch64.rpm"
RPM_HASH = "67c5a9498e1733a17391088dc2a4e6ee56cb74700b512fe55d39cf49102c145683756e39f70ba034c0dfc2e757eb381bab232d216d256d19569f11ecee67a905"

RPROVIDES:${PN} += "python3.9dist-inflate64 \
python39-inflate64 \
python3dist-inflate64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
