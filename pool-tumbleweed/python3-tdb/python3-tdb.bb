SUMMARY = "Python3 bindings for the Tdb library"
DESCRIPTION = "This package contains the Python3 bindings for the Tdb library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.8"

RPM_NAME = "python3-tdb-1.4.8-1.1.aarch64.rpm"
RPM_HASH = "228efe6000e080cb6c8b4e72ff77d8f22a577c92d9b868a5b393301b5cdf6c4ac052421285087cdc6f0c4eebbcc8c86fe98fb3d0737f6b93d59d6fb68391128b"

RPROVIDES:${PN} += "python3-tdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtdb.so.1 \
libtdb1 \
python-abi"

inherit rpm
