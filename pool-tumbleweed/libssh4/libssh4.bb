SUMMARY = "SSH library"
DESCRIPTION = "An SSH implementation in the form of a library. With libssh, you can remotely \
execute programs, transfer files, use a secure and transparent tunnel for your \
remote programs. It supports SFTP as well. \
 \
This package provides libssh from https://www.libssh.org that should not be \
confused with libssh2 available from https://www.libssh2.org (libssh2 package)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.5"

RPM_NAME = "libssh4-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "d8b9616b3b7ce76f1390981586efcd577969d8aa4f5265924fccbbba908dd04f29fee80a17450e91ed9e76e37d7ed37a15d9c81dcb761c71d92a846eaed98cf1"

RPROVIDES:${PN} += "libssh.so.4 \
libssh4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libssh-config \
libz.so.1"

inherit rpm
