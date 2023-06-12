SUMMARY = "Applications for working with the TDS (Tabular Data Stream) protocol"
DESCRIPTION = "FreeTDS is a project to document and implement the TDS (Tabular Data Stream) \
protocol. TDS is used by Sybase and Microsoft for client to database server \
communications. FreeTDS includes call level interfaces for DB-Lib, CT-Lib, \
and ODBC. \
 \
This package provides application to allow users to make use of the protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.17"

RPM_NAME = "freetds-tools-1.3.17-1.3.aarch64.rpm"
RPM_HASH = "57d24170a4216f2fb21a401881fa6d9e172fbff601f626d12dc2b11524a50bca1d0c29851d3a7435865da15787f23257b788ee46586141d9332790d8165a63a9"

RPROVIDES:${PN} += "freetds-tools \
freetds-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
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
libodbc.so.2()(64bit) \
libreadline.so.8()(64bit) \
libsybdb.so.5()(64bit)"

inherit rpm
