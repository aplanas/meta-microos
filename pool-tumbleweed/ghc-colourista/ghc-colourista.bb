SUMMARY = "Convenient interface for printing colourful messages"
DESCRIPTION = "Convenient interface for printing colourful messages based on the \
'ansi-terminal' library."
LICENSE = "MPL-2.0"

PV = "0.1.0.2"

RPM_NAME = "ghc-colourista-0.1.0.2-2.2.aarch64.rpm"
RPM_HASH = "100a7f00e5089197e032dde7d3fbd1f9f47c2d1bd950d48e0faae3ec8bdc6f3f7d54309daf53c96b1521c3c3dd9a2b342fa6eece27cd92651b22b39eb2560349"

RPROVIDES:${PN} += "ghc-colourista \
libHScolourista-0.1.0.2-19lLFYWP0ZEDfSw3obIpeF-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3-ghc9.4.6.so \
libHSansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so \
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
