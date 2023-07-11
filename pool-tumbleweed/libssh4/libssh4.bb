SUMMARY = "SSH library"
DESCRIPTION = "An SSH implementation in the form of a library. With libssh, you can remotely \
execute programs, transfer files, use a secure and transparent tunnel for your \
remote programs. It supports SFTP as well. \
 \
This package provides libssh from https://www.libssh.org that should not be \
confused with libssh2 available from https://www.libssh2.org (libssh2 package)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.5"

RPM_NAME = "libssh4-0.10.5-1.2.aarch64.rpm"
RPM_HASH = "5ee1d9a27add4bd998a18b9777528eb1c5374ea2bee2fca8bc2dcd97971a364b353a8165262a024506d3b645e28dd5bbb74fbd9e9da0f9109efe37543eccca6a"

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
