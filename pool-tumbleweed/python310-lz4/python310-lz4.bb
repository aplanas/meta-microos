SUMMARY = "LZ4 Bindings for Python"
DESCRIPTION = "This package provides python bindings for the lz4 compression library."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python310-lz4-4.3.2-1.4.aarch64.rpm"
RPM_HASH = "05b3492cfa884964d11c0a665dd8490b5d393caedf5323b38cea0a5ffa1f29422f59fcec873bc1f5311757558fc7d64aacc82ca87f1ca7d9e13b01a466edbb9d"

RPROVIDES:${PN} += "python3-lz4 \
python3.10dist-lz4 \
python310-lz4 \
python3dist-lz4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
python-abi"

inherit rpm
