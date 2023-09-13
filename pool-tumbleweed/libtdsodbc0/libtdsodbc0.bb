SUMMARY = "FreeTDS ODBC Driver for unixODBC"
DESCRIPTION = "The ODBC drivers is the FreeTDS's project most recent addition. Its \
chief advantage is that it makes FreeTDS servers look like other ODBC \
servers, a big help to people who know ODBC and/or write applications \
for several kinds of servers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.20"

RPM_NAME = "libtdsodbc0-1.3.20-1.1.aarch64.rpm"
RPM_HASH = "6f900777425b877806adbf260f7fbfcbd223dc5ee6c7cc97c92dbe92bffc12ec54e9ef63c084a9044642102e46b525cd0aa4b6ceab0a6887400ba6263452aefa"

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
