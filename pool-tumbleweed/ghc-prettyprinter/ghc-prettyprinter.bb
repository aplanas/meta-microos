SUMMARY = "A modern, easy to use, well-documented, extensible pretty-printer"
DESCRIPTION = "A modern, easy to use, well-documented, extensible pretty-printer. For more see \
README.md."
LICENSE = "BSD-2-Clause"

PV = "1.7.1"

RPM_NAME = "ghc-prettyprinter-1.7.1-2.2.aarch64.rpm"
RPM_HASH = "16b99bdb7c7a2d68fc4836a8a1ebd82342e3ae3cbaf14bd86afee531e1e14ef044797262e4da823c85c762188715582d63f6e7e35a87606e7f2a3bbe446279e5"

RPROVIDES:${PN} += "ghc-prettyprinter \
libHSprettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
