SUMMARY = "High performance python functional utilities in Cython"
DESCRIPTION = "Cython implementation of the toolz package, which provides high \
performance utility functions for iterables, functions, and \
dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.2"

RPM_NAME = "python39-cytoolz-0.12.2-1.1.aarch64.rpm"
RPM_HASH = "c01b131baa6adbfbef83e721bb6cf1d33f55739ba42826979fecdbf390cc06b439abcd42e04d28dd4c418b7b8f2615849f13cc2e4df1f37526d9f0e3dfd90fbc"

RPROVIDES:${PN} += "python3.9dist-cytoolz \
python39-cytoolz \
python3dist-cytoolz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-toolz"

inherit rpm
