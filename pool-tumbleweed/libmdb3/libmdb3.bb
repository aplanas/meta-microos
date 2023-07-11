SUMMARY = "MDB Tools ODBC driver for unixODBC"
DESCRIPTION = "Contains shared library libmdb3 from mdbtools"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libmdb3-1.0.0-1.8.aarch64.rpm"
RPM_HASH = "c26ba2a4422083176c47b9bd149e6cf590a72587309b72e9b33732e82c0d092df4ddc40bdc6eb0addc3cb871551a202ef910877f9ff7f0c45d55e6e206c61e48"

RPROVIDES:${PN} += "libmdb.so.3 \
libmdb3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
