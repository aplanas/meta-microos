SUMMARY = "Asychronous I/O support library"
DESCRIPTION = "Tree-sitter is a parser generator tool and an incremental parsing \
library. It can build a concrete syntax tree for a source file \
and efficiently update the syntax tree as the source file is \
edited. This is the package with the dynamically linked C library."
LICENSE = "MIT"

PV = "0.20.8"

RPM_NAME = "libtree-sitter0-0.20.8-2.2.aarch64.rpm"
RPM_HASH = "2cefd7529d43656d27947448ace2cd09096e9509db5b52d6718822f25cbeb8368eac1d3526428cb4412fe9e0a1c5f45f1d48598b81c0fb261a9e9a5272060366"

RPROVIDES:${PN} += "libtree-sitter.so.0 \
libtree-sitter0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
