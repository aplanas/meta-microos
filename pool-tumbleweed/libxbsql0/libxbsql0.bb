SUMMARY = "Shared libraries for xbsql"
DESCRIPTION = "XBase DBMS is a C++ library that supports access to XBase type data \
files and indexes (.dbf and related files, for example). It provides \
record level access to these files. \
 \
This package contains shared libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "0.11"

RPM_NAME = "libxbsql0-0.11-260.8.aarch64.rpm"
RPM_HASH = "1b4292e242e07fd4b88fb887c60e5191f69e8ae8c7cfd2eba290b7e58afc473237d0d5bc24d66509a8b8f07c57e225b72010017e2d6effebf252605c6f658b75"

RPROVIDES:${PN} += "libxbsql.so.0 \
libxbsql0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxbase64.so.1"

inherit rpm
