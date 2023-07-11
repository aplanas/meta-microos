SUMMARY = "Client library for accessing NFS shares over a network"
DESCRIPTION = "Package contains a library of functions for accessing NFSv2 and \
NFSv3 servers from user space. It provides a low-level, \
asynchronous RPC library for accessing NFS protocols, an \
asynchronous library with POSIX-like VFS functions, and a \
synchronous library with POSIX-like VFS functions."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "5.0.2"

RPM_NAME = "libnfs14-5.0.2-1.5.aarch64.rpm"
RPM_HASH = "7428486859a2f00af11f3ddfb97fc232c90c00c146e9c3454d30a878a6fa7e337b14280134cb096a3d9857bc90134a9ccab4aa3caa60586653ad7ee1bfb61d8e"

RPROVIDES:${PN} += "libnfs.so.14 \
libnfs14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
