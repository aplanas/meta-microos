SUMMARY = "Development files for the Remote Access to Persistent Memory library"
DESCRIPTION = "The librpmem library provides low-level support for remote access \
to persistent memory utilizing RDMA-capable NICs. It can be used \
to replicate persistent memory regions over RDMA protocol. \
 \
This sub-package contains libraries and header files for developing \
applications that want to specifically make use of librpmem."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "librpmem-devel-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "07bbf582192348426df16fda4fa684ec76a632129d4fe923dda412486e1a221c587aa439cff9052a5cf868b17663995c58a46309c876c3e0b75b16df6ee7a2a7"

RPROVIDES:${PN} += "librpmem-devel \
pkgconfig-librpmem"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1 \
librpmem1"

inherit rpm
