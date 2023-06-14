SUMMARY = "High performance python functional utilities in Cython"
DESCRIPTION = "Cython implementation of the toolz package, which provides high \
performance utility functions for iterables, functions, and \
dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python310-cytoolz-0.12.1-1.4.aarch64.rpm"
RPM_HASH = "aa898d62a370176adf0cdbc04ff35ad020937421fd6948ca1f6ed2d11e3079a0d7492a176716767374803b83f7d4fb69a0efcf5e4e1b6c5acfc97cac5c1a2eaf"

RPROVIDES:${PN} += "python3-cytoolz \
python3.10dist-cytoolz \
python310-cytoolz \
python3dist-cytoolz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-toolz"

inherit rpm
