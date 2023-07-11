SUMMARY = "GlusterFS Remote Procedure Call library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfrpc0-11.0-3.1.aarch64.rpm"
RPM_HASH = "392207e2a9ed8249b74d9eb2d2439bdbd90ce4f28ae42a82ddf6b6ebaaf652948a079aea2b55a3e2140cbff226b79382f7b7c851d8f7904aaa9252b0ce94a368"

RPROVIDES:${PN} += "libgfrpc.so.0 \
libgfrpc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfxdr.so.0 \
libglusterfs.so.0 \
libtirpc.so.3"

inherit rpm
