SUMMARY = "Haskell tasty-rerun library development files"
DESCRIPTION = "This package provides the Haskell tasty-rerun library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.18"

RPM_NAME = "ghc-tasty-rerun-devel-1.1.18-6.5.aarch64.rpm"
RPM_HASH = "313a48f82477066eab419d4a5cc5f808055149e11f3815a62a597f5e6a510d4dbef8c4e889908904666a216d8bb1c722464ab6f7f3324de4be7b2cc68c13c7a4"

RPROVIDES:${PN} += "ghc-devel-tasty-rerun-1.1.18-1dvQzPS8A67DYD4eAA2wLL \
ghc-tasty-rerun-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-devel-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-devel-stm-2.5.1.0 \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-devel-transformers-0.5.6.2 \
ghc-tasty-rerun"

inherit rpm
