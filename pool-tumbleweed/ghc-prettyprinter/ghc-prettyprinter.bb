SUMMARY = "A modern, easy to use, well-documented, extensible pretty-printer"
DESCRIPTION = "A modern, easy to use, well-documented, extensible pretty-printer. For more see \
README.md."
LICENSE = "BSD-2-Clause"

PV = "1.7.1"

RPM_NAME = "ghc-prettyprinter-1.7.1-2.3.aarch64.rpm"
RPM_HASH = "245f090de04acdffd5943cc145f2d85b8781a629d2f54892b8a56092176c5cceb1f0f41745492b22e1658332d5e310d7be0d02d22db0ab1cc5dc5064ff508c6b"

RPROVIDES:${PN} += "ghc-prettyprinter \
libHSprettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
