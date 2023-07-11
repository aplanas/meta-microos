SUMMARY = "LZ4 Bindings for Python"
DESCRIPTION = "This package provides python bindings for the lz4 compression library."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python310-lz4-4.3.2-2.3.aarch64.rpm"
RPM_HASH = "e77d14134b3f9ab89310f555c3c00f63f732d1b26e6a446c15c6738a5c61bd27dd485ac39ea756a463d58b0472a9e85ba082b27087b4d5326a9ccdb6b59d0045"

RPROVIDES:${PN} += "python3.10dist-lz4 \
python310-lz4 \
python3dist-lz4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
python-abi"

inherit rpm
