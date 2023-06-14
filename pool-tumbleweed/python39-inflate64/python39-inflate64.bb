SUMMARY = "Deflate64 compression/decompression library"
DESCRIPTION = "A python package to provide compression and decompression feature with Enhanced Deflate algorithm."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "python39-inflate64-0.3.1-1.5.aarch64.rpm"
RPM_HASH = "d036cb189edddcbab21962eaf1e8b1f45264f2f4dd6935d370ea561eccc98c0d5ab61615b93fa8674acbaab8e335632740b2b83d55878e5869689c98edf9fdb3"

RPROVIDES:${PN} += "python3.9dist-inflate64 \
python39-inflate64 \
python3dist-inflate64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
