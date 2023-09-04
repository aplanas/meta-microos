SUMMARY = "SSH library"
DESCRIPTION = "An SSH implementation in the form of a library. With libssh, you can remotely \
execute programs, transfer files, use a secure and transparent tunnel for your \
remote programs. It supports SFTP as well. \
 \
This package provides libssh from https://www.libssh.org that should not be \
confused with libssh2 available from https://www.libssh2.org (libssh2 package)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.5"

RPM_NAME = "libssh4-0.10.5-2.1.aarch64.rpm"
RPM_HASH = "e9bca5442356ea5f9d3970fe0b60ce8735eea0439182c6e66547a3afdd177083cc259f8cd4d6b1f77492bfeb5bd7ad162c236f6e0fd46d9bd017ddc12f15abf1"

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
