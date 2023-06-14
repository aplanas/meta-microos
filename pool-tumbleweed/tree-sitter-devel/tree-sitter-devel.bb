SUMMARY = "Development files for tree-sitter"
DESCRIPTION = "The tree-sitter-devel package contains libraries and header files for \
developing applications that use tree-sitter."
LICENSE = "MIT"

PV = "0.20.8"

RPM_NAME = "tree-sitter-devel-0.20.8-2.1.aarch64.rpm"
RPM_HASH = "04ba3e10eabbc7afcc3ede96368e50bbc886e101405e19a774fba9af2910b7924eb60d7a43547e3f368f2a835127a64815c529f40d5181f27113644e5911606c"

RPROVIDES:${PN} += "pkgconfig-tree-sitter \
tree-sitter-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtree-sitter0"

inherit rpm
