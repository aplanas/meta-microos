SUMMARY = "Userdb support for the Courier authentication library"
DESCRIPTION = "This package installs the userdb support for the Courier authentication \
library.  Userdb is a simple way to manage virtual mail accounts using \
a GDBM-based database file."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-userdb-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "21fcb8cc2a3c723ba6a43289833a4e0f1302e23434ae525617e74bc4b6ec3d2b2e8df958e54774d5dba6edfc7ec49604566dd9253c24d707d926ec203f41baca"

RPROVIDES:${PN} += "courier-authlib-userdb \
libauthuserdb.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcourierauth.so.0 \
libcourierauthcommon.so.0 \
libcrypt.so.1 \
libgdbm.so.6"

inherit rpm
