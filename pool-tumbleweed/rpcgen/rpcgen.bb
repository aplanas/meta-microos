SUMMARY = "RPC protocol compiler"
DESCRIPTION = "rpcgen is a tool that generates C code to implement an RPC protocol. \
The input to rpcgen is a language similar to C known as RPC Language \
(Remote Procedure Call Language)."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "rpcgen-1.4.4-1.1.aarch64.rpm"
RPM_HASH = "ac5d708250ea57fb2ebf6c1600af0b41eaf8e128cd4a39c787933ecd4813be005101a733eec7fbb2deb85446fd960c46aa5cc58cf5a3a1781c54f280a37f3544"

RPROVIDES:${PN} += "glibc-devel-/usr/bin/rpcgen \
rpcgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
