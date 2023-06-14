SUMMARY = "Interface to C file/magic library"
DESCRIPTION = "This package provides a Haskell interface to the C libmagic library. \
With it, you can determine the type of a file by examining its contents rather \
than its name. The Haskell interface provides a full-featured binding."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-1.1-4.3.aarch64.rpm"
RPM_HASH = "9940e6ee93ead6a722cb6445aaa2888dea3e68633665b3bf9f03444da36a980d687f1ee79794fc22aa0adcfd13eb753fab6dfdb47def4381b31d118d785a4f05"

RPROVIDES:${PN} += "ghc-magic \
libHSmagic-1.1-FZjtT3pxmlr6oRrs4QNuLe-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmagic.so.1"

inherit rpm
