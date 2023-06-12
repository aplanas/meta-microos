SUMMARY = "Libraries needed to run iODBC"
DESCRIPTION = "The iODBC Driver Manager is an implementation of the SAG CLI andx \
ODBC compliant driver manager which allows developers to write ODBC \
compliant applications that can connect to various databases using \
appropriate backend drivers. \
 \
This package provides the shared libraries needed by iODBC."
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.14"

RPM_NAME = "libiodbc2-3.52.14-2.6.aarch64.rpm"
RPM_HASH = "ef0f9f08040cfbe6f0059870f2f67f608bbff0f3c7ae6c324b0254c5f20c7e425095676dc733a65101452d548743d038882fcab84db36d9e2769a5902257cfb6"

RPROVIDES:${PN} += "libiodbc.so.2()(64bit) \
libiodbc2 \
libiodbc2(aarch-64) \
libiodbcinst.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
