SUMMARY = "Python 3 bindings for LibBytesize"
DESCRIPTION = "This package contains Python 3 bindings for LibBytesize making the use of \
the library from Python 3 easier and more convenient."
LICENSE = "LGPL-2.1-only"

PV = "2.9"

RPM_NAME = "python3-libbytesize-2.9-1.1.aarch64.rpm"
RPM_HASH = "042b01d167aabcb7f62f6f81d165e66441c1d349f36cfbed17a5b3b46c863f257e0050579e7f0050fd41560c6423f742541d7b7eb622c4f7f24311bccb6c4085"

RPROVIDES:${PN} += "python3-libbytesize"

RDEPENDS:${PN} += "libbytesize1 \
python-abi \
python3-six"

inherit rpm
