SUMMARY = "FreeTDS ODBC Driver for unixODBC"
DESCRIPTION = "The ODBC drivers is the FreeTDS's project most recent addition. Its \
chief advantage is that it makes FreeTDS servers look like other ODBC \
servers, a big help to people who know ODBC and/or write applications \
for several kinds of servers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.17"

RPM_NAME = "libtdsodbc0-1.3.17-1.3.aarch64.rpm"
RPM_HASH = "25d54887354fd8c2ff88b1dc676a6c23804d61d54b9af95059912de21153c82a988162ace11dda00c37533cb6dc424f65839ffe60a8d312b8590cac8fb912826"

RPROVIDES:${PN} += "libtdsodbc.so.0()(64bit) \
libtdsodbc0 \
libtdsodbc0(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgmp.so.10()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libhogweed.so.6()(64bit) \
libhogweed.so.6(HOGWEED_6)(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
libodbcinst.so.2()(64bit) \
unixODBC"

inherit rpm
