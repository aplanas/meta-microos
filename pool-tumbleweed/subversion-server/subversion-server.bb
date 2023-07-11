SUMMARY = "Apache server module for Subversion server"
DESCRIPTION = "The subversion-server package adds the Subversion server Apache module \
to the Apache directories and configuration."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-server-1.14.2-6.1.aarch64.rpm"
RPM_HASH = "a597440d831e5d2c1082a68048135bcb4834dc40e44ef025173fd9a44a17c67f5e7e4de2f7ccf72d5c56794caa954adf1ca823d10741aa5a881c423ff70a38eb"

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
