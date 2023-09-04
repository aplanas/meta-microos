SUMMARY = "Haskell tasty-quickcheck library development files"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck library development \
files."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-quickcheck-devel-0.10.2-2.5.aarch64.rpm"
RPM_HASH = "4d3d06fb8ebd9228f7b370ff476c608b22ca53bc4aca856edc438ac771c30191a7049cedbe752817110a19149d3ce62290d8500cbd97b7da3dc030f02cb13fd4"

RPROVIDES:${PN} += "ghc-devel-tasty-quickcheck-0.10.2-2UFPyzLXBXCItwO8bufmfg \
ghc-tasty-quickcheck-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8 \
ghc-devel-base-4.17.2.0 \
ghc-devel-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-tasty-quickcheck"

inherit rpm
