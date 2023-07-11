SUMMARY = "Python3 bindings for the Tdb library"
DESCRIPTION = "This package contains the Python3 bindings for the Tdb library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.8"

RPM_NAME = "python3-tdb-1.4.8-1.2.aarch64.rpm"
RPM_HASH = "0c9dcc16a07bdc28384e63f8987f3233226bfd21c980dc760209135e1709630b0094f5d7a5b98480d48f816b97bf452c14770e7b71efc556abbc117aeacff4dd"

RPROVIDES:${PN} += "python3-tdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtdb.so.1 \
libtdb1 \
python-abi"

inherit rpm
