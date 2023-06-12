SUMMARY = "Deflate64 compression/decompression library"
DESCRIPTION = "A python package to provide compression and decompression feature with Enhanced Deflate algorithm."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "python311-inflate64-0.3.1-1.5.aarch64.rpm"
RPM_HASH = "229f50fd58f34bf39b3f3435eaf5c09561e9091b1ed2c0bb8bb83d06261ecee5a7083c0f78a20d83a61664f066c9444f9380f45c8ab2cc151d9f712ee4917bc6"

RPROVIDES:${PN} += "python3.11dist(inflate64) \
python311-inflate64 \
python311-inflate64(aarch-64) \
python3dist(inflate64)"
RDEPENDS:${PN} += "(python311-importlib_metadata if python311-base < 3.8) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
