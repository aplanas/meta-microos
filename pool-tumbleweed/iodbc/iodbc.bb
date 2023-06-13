SUMMARY = "ODBC compliant driver manager"
DESCRIPTION = "The iODBC Driver Manager is an implementation of the SAG CLI and \
ODBC compliant driver manager which allows developers to write ODBC \
compliant applications that can connect to various databases using \
appropriate backend drivers."
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.14"

RPM_NAME = "iodbc-3.52.14-2.6.aarch64.rpm"
RPM_HASH = "d41630b3a6b640be170877e14225afb554dba5a9743386174ac29e88862e3dddb45190f119cb9e32d1e920bfcbbfe789ed9f2133f8a1cb85fad1f37853030cba"

RPROVIDES:${PN} += "iodbc \
iodbc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libiodbc.so.2()(64bit)"

inherit rpm
