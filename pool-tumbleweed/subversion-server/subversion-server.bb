SUMMARY = "Apache server module for Subversion server"
DESCRIPTION = "The subversion-server package adds the Subversion server Apache module \
to the Apache directories and configuration."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-server-1.14.2-6.2.aarch64.rpm"
RPM_HASH = "2bd00ef294888d334423248f298bc19de6911ebe40c5f32a316274ad210860d1fea09c0562415247f189c8f7adbb6a4dc27696bb4e8b0bf57bf269faf87d6499"

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
