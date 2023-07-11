SUMMARY = "Development files for tree-sitter"
DESCRIPTION = "The tree-sitter-devel package contains libraries and header files for \
developing applications that use tree-sitter."
LICENSE = "MIT"

PV = "0.20.8"

RPM_NAME = "tree-sitter-devel-0.20.8-2.2.aarch64.rpm"
RPM_HASH = "b4f27268d7f962e7fb3ba69df6edb1acb668bc3b4b25c1604ff1110aba5d11bfe205a39894ca82f4743785dbd5bef0768c202c4f3b259eacf7ad9d062a504d23"

RPROVIDES:${PN} += "pkgconfig-tree-sitter \
tree-sitter-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtree-sitter0"

inherit rpm
