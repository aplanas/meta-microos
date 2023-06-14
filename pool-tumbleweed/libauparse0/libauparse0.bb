SUMMARY = "Library for parsing and interpreting audit events"
DESCRIPTION = "The libauparse package contains the shared libraries needed to \
parse audit records."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "libauparse0-3.0.9-1.3.aarch64.rpm"
RPM_HASH = "1b7538a96260a13e0164bb47182fcd6c5a0b93a2b4a9361a8a8fdb1e08bbca72c9dbd60e0f25a5cdd4e5342704beeeeb1b43677e9fad862df016e845dbdb9db9"

RPROVIDES:${PN} += "libauparse.so.0 \
libauparse0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6"

inherit rpm
