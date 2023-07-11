SUMMARY = "Deflate64 compression/decompression library"
DESCRIPTION = "A python package to provide compression and decompression feature with Enhanced Deflate algorithm."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "python310-inflate64-0.3.1-2.1.aarch64.rpm"
RPM_HASH = "121e875a3fdaba11f379efc411ba9b5fee9f478504c7dc6c3922636029569372088dc8bd79f5a36aa4f533a7b62f93bde91d59c530af56a8126753486cc574ff"

RPROVIDES:${PN} += "python3.10dist-inflate64 \
python310-inflate64 \
python3dist-inflate64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
