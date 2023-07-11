SUMMARY = "Deflate64 compression/decompression library"
DESCRIPTION = "A python package to provide compression and decompression feature with Enhanced Deflate algorithm."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "python311-inflate64-0.3.1-2.1.aarch64.rpm"
RPM_HASH = "726c03b2fbcb6f1f801f750b16e246e414785555cd2ed51671497a961d6b4d1b93b37cbe73dbdc1d4e56132e559ec651db642d30fafbc29ec2db234143e28b8a"

RPROVIDES:${PN} += "python3-inflate64 \
python3.11dist-inflate64 \
python311-inflate64 \
python3dist-inflate64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
