SUMMARY = "High performance python functional utilities in Cython"
DESCRIPTION = "Cython implementation of the toolz package, which provides high \
performance utility functions for iterables, functions, and \
dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.2"

RPM_NAME = "python311-cytoolz-0.12.2-1.1.aarch64.rpm"
RPM_HASH = "082b02007bd1b57822215ffe188500b4b0a225d7cc49368e7872528d99d47fc72d68f2550535e46a5ee0092852ac5f3040e5bd56a9acff43bfc27907f34d0fcc"

RPROVIDES:${PN} += "python3-cytoolz \
python3.11dist-cytoolz \
python311-cytoolz \
python3dist-cytoolz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-toolz"

inherit rpm
