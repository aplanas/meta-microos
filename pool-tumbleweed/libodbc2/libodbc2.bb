SUMMARY = "Open Database Connectivity API"
DESCRIPTION = "ODBC is an API that abstracts the access to different database \
management systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.11"

RPM_NAME = "libodbc2-2.3.11-3.1.aarch64.rpm"
RPM_HASH = "22d2f6c62c866ac56de4cbc1cd216e8480fdc66e0bef980509762ebfbdf402c1fa078a66498d7b3e4827af3bc4b6c9121bcf435ba6a9b0c9c2975ec081367651"

RPROVIDES:${PN} += "libodbc.so.2 \
libodbc2 \
libodbccr.so.2 \
libodbcinst.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7"

inherit rpm
