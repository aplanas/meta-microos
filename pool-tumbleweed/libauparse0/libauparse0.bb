SUMMARY = "Library for parsing and interpreting audit events"
DESCRIPTION = "The libauparse package contains the shared libraries needed to \
parse audit records."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.1"

RPM_NAME = "libauparse0-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "806177483fb3bb3f6f2df5765b56ee784109e223877443bd4850113ffd0bd0913ae348e8b2cf788f4ded1adadcb580725eb4fdb245190cd4a45e4c81a2df2d81"

RPROVIDES:${PN} += "libauparse.so.0 \
libauparse0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6"

inherit rpm
