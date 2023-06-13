SUMMARY = "Userdb support for the Courier authentication library"
DESCRIPTION = "This package installs the userdb support for the Courier authentication \
library.  Userdb is a simple way to manage virtual mail accounts using \
a GDBM-based database file."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-userdb-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "21fcb8cc2a3c723ba6a43289833a4e0f1302e23434ae525617e74bc4b6ec3d2b2e8df958e54774d5dba6edfc7ec49604566dd9253c24d707d926ec203f41baca"

RPROVIDES:${PN} += "courier-authlib-userdb \
courier-authlib-userdb(aarch-64) \
libauthuserdb.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcourierauth.so.0()(64bit) \
libcourierauthcommon.so.0()(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libgdbm.so.6()(64bit)"

inherit rpm
