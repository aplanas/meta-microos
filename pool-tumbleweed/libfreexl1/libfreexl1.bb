SUMMARY = "Shared library for FreeXL"
DESCRIPTION = "FreeXL is an open source library to extract valid data from within an Excel \
(.xls) spreadsheet."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "1.0.6"

RPM_NAME = "libfreexl1-1.0.6-1.8.aarch64.rpm"
RPM_HASH = "e85eb90ee50abe86f1651cb02d4a827212b0452fdba7bb3408054372a99cbbad1e027be0c9b7aefd0a36764a2e12e601a31931031ed3a2bfa816eaee9b6ae417"

RPROVIDES:${PN} += "libfreexl.so.1()(64bit) \
libfreexl1 \
libfreexl1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
