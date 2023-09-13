SUMMARY = "Applications for working with the TDS (Tabular Data Stream) protocol"
DESCRIPTION = "FreeTDS is a project to document and implement the TDS (Tabular Data Stream) \
protocol. TDS is used by Sybase and Microsoft for client to database server \
communications. FreeTDS includes call level interfaces for DB-Lib, CT-Lib, \
and ODBC. \
 \
This package provides application to allow users to make use of the protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.20"

RPM_NAME = "freetds-tools-1.3.20-1.1.aarch64.rpm"
RPM_HASH = "bc041292b9c4bf0b150bdb952f25cad04c2eee4b5edb2af93efb56000b0af7077972618bb8f066ff13160a502943289dfd442c0b011000b493eb2d807a1a764a"

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
