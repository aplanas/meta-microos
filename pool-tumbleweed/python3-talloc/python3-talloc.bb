SUMMARY = "Python3 bindings for the Talloc library"
DESCRIPTION = "This package contains the Python3 bindings for the Talloc library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "python3-talloc-2.4.0-3.1.aarch64.rpm"
RPM_HASH = "876c3c466438dfae98067ee960c56a04fc3ee359eef6f8d67ef947f65ccf870e40309c02388792095f17be3b5b90a121345cf3bf17e03262dce7b3941ba63e4a"

RPROVIDES:${PN} += "libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2 \
python3-talloc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.10.so.1.0 \
libtalloc.so.2 \
libtalloc2 \
python-abi"

inherit rpm
