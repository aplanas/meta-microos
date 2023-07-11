SUMMARY = "Files for developing with xbsql"
DESCRIPTION = "XBase DBMS is a C++ library that supports access to XBase type data \
files and indexes (.dbf and related files, for example). It provides \
record level access to these files. \
 \
This package contains development files"
LICENSE = "LGPL-2.1-or-later"

PV = "0.11"

RPM_NAME = "xbsql-devel-0.11-260.9.aarch64.rpm"
RPM_HASH = "ec979e1f2877e82b10ec462963c452c7c8bc2b8c33765a7ba85c7ab5a11c7d2d316889f96fa8a93e5b6172dfeb69e51666c62ddbf109902732bcb22832d87a15"

RPROVIDES:${PN} += "xbsql-devel"

RDEPENDS:${PN} += "libxbsql0"

inherit rpm
