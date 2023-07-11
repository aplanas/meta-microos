SUMMARY = "Applications for working with the TDS (Tabular Data Stream) protocol"
DESCRIPTION = "FreeTDS is a project to document and implement the TDS (Tabular Data Stream) \
protocol. TDS is used by Sybase and Microsoft for client to database server \
communications. FreeTDS includes call level interfaces for DB-Lib, CT-Lib, \
and ODBC. \
 \
This package provides application to allow users to make use of the protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.18"

RPM_NAME = "freetds-tools-1.3.18-1.1.aarch64.rpm"
RPM_HASH = "8ca616f56cd15473719dd0550b4ae01c629711b2f59eb2f1e8c6b8377e7b5e3e117d3bfa98a9f4b5da1b990e0d22723b60a5a1672b2cfd9c402e43dfce5e0aea"

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
