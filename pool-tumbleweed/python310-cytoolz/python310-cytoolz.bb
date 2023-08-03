SUMMARY = "High performance python functional utilities in Cython"
DESCRIPTION = "Cython implementation of the toolz package, which provides high \
performance utility functions for iterables, functions, and \
dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.2"

RPM_NAME = "python310-cytoolz-0.12.2-1.1.aarch64.rpm"
RPM_HASH = "6c4585036cd0c8032e56e5a936a7ac8877f22bd9ae6fc76a9bf52a9a410b0bb6140aa8c7ffba8fd7f1c9c169e1c7111103a6e5881718ee2ef0c0a0a70026bd2b"

RPROVIDES:${PN} += "python3.10dist-cytoolz \
python310-cytoolz \
python3dist-cytoolz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-toolz"

inherit rpm
