SUMMARY = "Happy is a parser generator for Haskell"
DESCRIPTION = "Happy is a parser generator for Haskell. Given a grammar specification in BNF, \
Happy generates Haskell code to parse the grammar. Happy works in a similar way \
to the 'yacc' tool for C."
LICENSE = "BSD-2-Clause"

PV = "1.20.1.1"

RPM_NAME = "happy-1.20.1.1-1.4.aarch64.rpm"
RPM_HASH = "71ee53da3cd56e39d9380cfd7910f2acd631f36bbc009bac8e8d81303f960b971f4b1bfe104c350a0f3fbbfb126b4f997c60e00103a26c598475a593cf6db8d5"

RPROVIDES:${PN} += "happy"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
