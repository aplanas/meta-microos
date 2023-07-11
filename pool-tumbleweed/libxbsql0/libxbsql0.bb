SUMMARY = "Shared libraries for xbsql"
DESCRIPTION = "XBase DBMS is a C++ library that supports access to XBase type data \
files and indexes (.dbf and related files, for example). It provides \
record level access to these files. \
 \
This package contains shared libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "0.11"

RPM_NAME = "libxbsql0-0.11-260.9.aarch64.rpm"
RPM_HASH = "dd3af6f67fc30ba8b6c49760f29d4fa1b3d81c9266230cb1941a6f5097d57c2ed3acedd08f318bb7496a41999bae81c8e316cc9fc618990ec9feb002d69021b6"

RPROVIDES:${PN} += "libxbsql.so.0 \
libxbsql0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxbase64.so.1"

inherit rpm
