SUMMARY = "Userdb support for the Courier authentication library"
DESCRIPTION = "This package installs the userdb support for the Courier authentication \
library.  Userdb is a simple way to manage virtual mail accounts using \
a GDBM-based database file."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-userdb-0.72.0-1.5.aarch64.rpm"
RPM_HASH = "62c32272c932a954f2e14c29a4d13e0d9352ad101a3c1e8f73c4350cf9c40de29c872505f7114d4ac258ef0373578afc641a71eb5f0ac615a1b95c51576a97dd"

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
