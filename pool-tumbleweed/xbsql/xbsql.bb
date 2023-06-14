SUMMARY = "SQL Wrapper for the XBase Library"
DESCRIPTION = "XBase DBMS is a C++ library that supports access to XBase type data \
files and indexes (.dbf and related files, for example). It provides \
record level access to these files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11"

RPM_NAME = "xbsql-0.11-260.8.aarch64.rpm"
RPM_HASH = "1569ca7d6de7242e5d154d91c758340acedc53de20737743e1caeda97d5a9e0c7425b50ef876072e2061b850dbe41fe66a1423a57e9a891b20b71b8694aaa8b4"

RPROVIDES:${PN} += "xbsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libreadline.so.8 \
libstdc++.so.6 \
libxbsql.so.0"

inherit rpm
