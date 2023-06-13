SUMMARY = "Tools for libaccounts-glib"
DESCRIPTION = "This package contains the tools for the accounts-glib library."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "libaccounts-glib-tools-1.26-1.3.aarch64.rpm"
RPM_HASH = "a0d9aaa026ad24d2e44296a4d831ecf54b179f733ebb6985f0b680c81e2bbb1cc4474b93842bc5ec7331fb0d615a9aa95de1855ceb21ce9e20f2ea4c52236af2"

RPROVIDES:${PN} += "libaccounts-glib-tools \
libaccounts-glib-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libaccounts-glib.so.0()(64bit) \
libaccounts-glib0 \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
