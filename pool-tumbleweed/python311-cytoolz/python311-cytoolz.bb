SUMMARY = "High performance python functional utilities in Cython"
DESCRIPTION = "Cython implementation of the toolz package, which provides high \
performance utility functions for iterables, functions, and \
dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python311-cytoolz-0.12.1-1.6.aarch64.rpm"
RPM_HASH = "00e4941f7769ac922eec17b1742bedef0a7ab5908de0ebd4bcc6b535d8d1bd934329e0351b065502d94092aaaa92c1dd3bf3a667197e2cccfc8f43c13c8ad1a1"

RPROVIDES:${PN} += "python3-cytoolz \
python3.11dist-cytoolz \
python311-cytoolz \
python3dist-cytoolz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-toolz"

inherit rpm
