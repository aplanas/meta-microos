SUMMARY = "High performance python functional utilities in Cython"
DESCRIPTION = "Cython implementation of the toolz package, which provides high \
performance utility functions for iterables, functions, and \
dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python310-cytoolz-0.12.1-1.6.aarch64.rpm"
RPM_HASH = "f8fb808801753e9efa9d6998bff7d4da03a0e6116270f4c877e9e00101cc2085cad927106c0c113fcf4fcbef3e04c68ebb67c008918ab696ce726e6a31ecd2b0"

RPROVIDES:${PN} += "python3.10dist-cytoolz \
python310-cytoolz \
python3dist-cytoolz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-toolz"

inherit rpm
