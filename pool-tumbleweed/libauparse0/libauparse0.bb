SUMMARY = "Library for parsing and interpreting audit events"
DESCRIPTION = "The libauparse package contains the shared libraries needed to \
parse audit records."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "libauparse0-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "9a8778264f82235e1cdce4a8f91c763f68a5ad359008f7848ae0425ea9d0e548a49fa33dac0989b506481bed986261619f1b9fa75330d51d51b224e9094133a4"

RPROVIDES:${PN} += "libauparse.so.0 \
libauparse0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6"

inherit rpm
