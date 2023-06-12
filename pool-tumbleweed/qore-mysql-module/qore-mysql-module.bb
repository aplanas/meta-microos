SUMMARY = "MySQL DBI module for Qore"
DESCRIPTION = "MySQL DBI driver module for the Qore Programming Language. The MySQL driver is \
character set aware and supports multithreading, transaction management, and \
stored procedure execution."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "2.1"

RPM_NAME = "qore-mysql-module-2.1-1.5.aarch64.rpm"
RPM_HASH = "7ebf0d185a72daf9340217594150f7d6be9b162b3aa2e84a6cf6128633eeea112470b83dd358c2f2b376c3ef9c7e34b0508c25419b0a2a0005aa49b7490a50ee"

RPROVIDES:${PN} += "qore-mysql-module \
qore-mysql-module(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
qore-module(abi)(aarch-64)"

inherit rpm
