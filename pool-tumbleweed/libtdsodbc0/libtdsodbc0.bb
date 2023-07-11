SUMMARY = "FreeTDS ODBC Driver for unixODBC"
DESCRIPTION = "The ODBC drivers is the FreeTDS's project most recent addition. Its \
chief advantage is that it makes FreeTDS servers look like other ODBC \
servers, a big help to people who know ODBC and/or write applications \
for several kinds of servers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.18"

RPM_NAME = "libtdsodbc0-1.3.18-1.1.aarch64.rpm"
RPM_HASH = "daf22c6911c57e895c273567891486ca73ef8021b1e512e6c58ea791c08bd9015ff80a0f6296cbcb3c8adb5c3e1c4a84e5e12a2d262433b5d06798f65284da1f"

RPROVIDES:${PN} += "libtdsodbc.so.0 \
libtdsodbc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libhogweed.so.6 \
libnettle.so.8 \
libodbcinst.so.2 \
unixODBC"

inherit rpm
