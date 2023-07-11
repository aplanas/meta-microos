SUMMARY = "Python3 bindings for the Talloc library"
DESCRIPTION = "This package contains the Python3 bindings for the Talloc library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "python3-talloc-2.4.0-3.2.aarch64.rpm"
RPM_HASH = "e4fa9a6032a87f50d519f91e4d2e22a242aa3ab09b95bdf7c11848c5b39b7acc4227b2c6b53e6eab5dfadf44ee6ac847711036f2883d5bf4a9666ab59d984e8a"

RPROVIDES:${PN} += "libpytalloc-util.cpython-311-aarch64-linux-gnu.so.2 \
python3-talloc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libtalloc.so.2 \
libtalloc2 \
python-abi"

inherit rpm
