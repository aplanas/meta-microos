SUMMARY = "PostgreSQL DBI module for Qore"
DESCRIPTION = "PostgreSQL DBI driver module for the Qore Programming Language. The PostgreSQL \
driver is character set aware, supports multithreading, transaction management, \
stored prodedure and function execution, etc."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "3.2.0"

RPM_NAME = "qore-pgsql-module-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "fe7f22bd5b2d08b81669d84828f13e8bf19e0159e5e7381ec9bcd98207e0f9ea7ac9262c952c547c0c16e5f21c04a273deda5bb9aa639d9dd97a3bd8fdde7d40"

RPROVIDES:${PN} += "qore-pgsql-module \
qore-pgsql-module(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
qore-module(abi)(aarch-64)"

inherit rpm
