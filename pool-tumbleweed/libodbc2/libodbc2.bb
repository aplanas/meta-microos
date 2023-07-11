SUMMARY = "Open Database Connectivity API"
DESCRIPTION = "ODBC is an API that abstracts the access to different database \
management systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.11"

RPM_NAME = "libodbc2-2.3.11-2.5.aarch64.rpm"
RPM_HASH = "b1816b1f1bef74de70baec6d2b8effdb26f19c9717ba4ee2355c85bd8bb24c141d80b2cf90c5594521d254aca8f65ae6230713fdf3a15975296cf00b4a1689e2"

RPROVIDES:${PN} += "libodbc.so.2 \
libodbc2 \
libodbccr.so.2 \
libodbcinst.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7"

inherit rpm
