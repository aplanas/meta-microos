SUMMARY = "Modern and extensible testing framework"
DESCRIPTION = "Tasty is a modern testing framework for Haskell. It lets you combine your unit \
tests, golden tests, QuickCheck/SmallCheck properties, and any other types of \
tests into a single test suite."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "ghc-tasty-1.4.3-2.4.aarch64.rpm"
RPM_HASH = "c6fbb4966e2481a17508f168b4ea2cba4d55fcca146668353ca5c5e77ac1948610cfe513eecc77edfff5792c0feff7df17d1b79a2fe0ec9290675624024ee958"

RPROVIDES:${PN} += "ghc-tasty \
libHStasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3-ghc9.4.6.so \
libHSansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSoptparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB-ghc9.4.6.so \
libHSprettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
