SUMMARY = "Haskell xhtml library"
DESCRIPTION = "This package provides the Haskell xhtml library."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-3000.2.2.1-3.2.aarch64.rpm"
RPM_HASH = "a2ba05ff6d1974e9209d7fc7b848d897ae38c3ef30ca995ad7f7118cbc8b1a80e0ca64edac3169cac4670e693f34da2f7afb553c5ea46403439bdfaf1918e20d"

RPROVIDES:${PN} += "ghc-xhtml \
libHSxhtml-3000.2.2.1-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
