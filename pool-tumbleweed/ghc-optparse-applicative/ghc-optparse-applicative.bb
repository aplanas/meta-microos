SUMMARY = "Utilities and combinators for parsing command line options"
DESCRIPTION = "Optparse-applicative is a haskell library for parsing options on the command \
line, and providing a powerful applicative interface for composing them. \
 \
optparse-applicative takes care of reading and validating the arguments passed \
to the command line, handling and reporting errors, generating a usage line, a \
comprehensive help screen, and enabling context-sensitive bash, zsh, and fish \
completions. \
 \
See the included README for detailed instructions and examples, which is also \
available on github <https://github.com/pcapriotti/optparse-applicative>."
LICENSE = "BSD-3-Clause"

PV = "0.18.1.0"

RPM_NAME = "ghc-optparse-applicative-0.18.1.0-1.5.aarch64.rpm"
RPM_HASH = "f2f26f5d4ddf2eb4ed28102207c97510d84e17130f2f0937a651c8aa5d16fd08a0593488febc4b6383f0cd8804903fd25f03e1a4632e440643100763a1feea6c"

RPROVIDES:${PN} += "ghc-optparse-applicative \
libHSoptparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm-ghc9.4.6.so"

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
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB-ghc9.4.6.so \
libHSprettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
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
