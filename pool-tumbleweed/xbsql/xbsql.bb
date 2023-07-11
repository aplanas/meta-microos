SUMMARY = "SQL Wrapper for the XBase Library"
DESCRIPTION = "XBase DBMS is a C++ library that supports access to XBase type data \
files and indexes (.dbf and related files, for example). It provides \
record level access to these files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11"

RPM_NAME = "xbsql-0.11-260.9.aarch64.rpm"
RPM_HASH = "ffeabb1a025aa9b3a466554c61240a7cb4dd15ac33d4b7afc89db1b4159329edc962d0c2046c115ff161235628d138477d95dab6dddeaa960418272edebfc157"

RPROVIDES:${PN} += "xbsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libreadline.so.8 \
libstdc++.so.6 \
libxbsql.so.0"

inherit rpm
