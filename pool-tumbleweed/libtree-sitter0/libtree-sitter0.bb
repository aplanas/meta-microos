SUMMARY = "Asychronous I/O support library"
DESCRIPTION = "Tree-sitter is a parser generator tool and an incremental parsing \
library. It can build a concrete syntax tree for a source file \
and efficiently update the syntax tree as the source file is \
edited. This is the package with the dynamically linked C library."
LICENSE = "MIT"

PV = "0.20.8"

RPM_NAME = "libtree-sitter0-0.20.8-2.1.aarch64.rpm"
RPM_HASH = "b81e87842d05f1d3e1de9dfc3c735b5b0bb74f8820dd046d1794566a4c992e5690e36268cbf865dd8036747de2884590021cef535663d70997a8464e54579bae"

RPROVIDES:${PN} += "libtree-sitter.so.0()(64bit) \
libtree-sitter0 \
libtree-sitter0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
