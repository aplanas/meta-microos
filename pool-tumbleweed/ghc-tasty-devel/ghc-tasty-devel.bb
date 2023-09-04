SUMMARY = "Haskell tasty library development files"
DESCRIPTION = "This package provides the Haskell tasty library development files."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "ghc-tasty-devel-1.4.3-2.4.aarch64.rpm"
RPM_HASH = "772b94aaf451eafee9b6279f092476da189d2fae0df864063363d855df67e0c2b63826d3ae9dcd7bc011cb4675b6f28fccfc15cf58b796592b98c7ea605326bd"

RPROVIDES:${PN} += "ghc-devel-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-tasty-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-devel-stm-2.5.1.0 \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-tasty"

inherit rpm
