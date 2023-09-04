SUMMARY = "Haskell xhtml library"
DESCRIPTION = "This package provides the Haskell xhtml library."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-3000.2.2.1-1.1.aarch64.rpm"
RPM_HASH = "5aa9d0207ae573b3008159cad20423d3a9885a5f97abfbdfb69c0e36eba6f5a179d4f9114ccbb4dc7b771df6a0a896964312c1e117404ee9727203f83632cfde"

RPROVIDES:${PN} += "ghc-xhtml \
libHSxhtml-3000.2.2.1-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
