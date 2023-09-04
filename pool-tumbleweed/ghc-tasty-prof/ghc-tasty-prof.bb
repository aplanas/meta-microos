SUMMARY = "Haskell tasty profiling library"
DESCRIPTION = "This package provides the Haskell tasty profiling library."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "ghc-tasty-prof-1.4.3-2.4.aarch64.rpm"
RPM_HASH = "8a01202ae19f4d1c67e6ea48d23da0928e2f2bfdb1bb26b022026479906ad09cd4adc37298782f7f5182139b150a90e9a1fd69c940aa725b6b6563faa63cdb31"

RPROVIDES:${PN} += "ghc-prof-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-tasty-prof"

RDEPENDS:${PN} += "ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-prof-stm-2.5.1.0 \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-tasty-devel"

inherit rpm
