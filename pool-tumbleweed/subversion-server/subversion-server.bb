SUMMARY = "Apache server module for Subversion server"
DESCRIPTION = "The subversion-server package adds the Subversion server Apache module \
to the Apache directories and configuration."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-server-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "169795b325cadebc5b547ff5e14eb35898e82c64b895a5a059cc1fd0c1a5dce662de566f429ce871afe95d15588f14ff568578ef92ee197de45ada46e5bc7e6c"

RPROVIDES:${PN} += "config-subversion-server \
subversion-server"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libsvn-delta-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
subversion"

inherit rpm
