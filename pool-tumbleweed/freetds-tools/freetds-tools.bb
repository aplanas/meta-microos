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

RPROVIDES:${PN} += "freetds-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libhogweed.so.6 \
libnettle.so.8 \
libodbc.so.2 \
libreadline.so.8 \
libsybdb.so.5"

inherit rpm
