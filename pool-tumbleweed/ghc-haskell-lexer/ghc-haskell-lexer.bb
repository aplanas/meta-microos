SUMMARY = "A fully compliant Haskell 98 lexer"
DESCRIPTION = "A fully compliant Haskell 98 lexer."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-1.1.1-2.8.aarch64.rpm"
RPM_HASH = "3264759bc04f697d25b83d61a01b3f704807418497cbb96f2b1a5e7a896a27770b9bc73edaee73e307ffa17b3ca7a1ec5c31658268c45039541738a8afd82583"

RPROVIDES:${PN} += "ghc-haskell-lexer \
libHShaskell-lexer-1.1.1-C14Cmw3wUWQ88vb32sfZ2Z-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
