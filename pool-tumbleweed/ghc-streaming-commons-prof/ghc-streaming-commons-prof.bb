SUMMARY = "Haskell streaming-commons profiling library"
DESCRIPTION = "This package provides the Haskell streaming-commons profiling library."
LICENSE = "MIT"

PV = "0.2.2.6"

RPM_NAME = "ghc-streaming-commons-prof-0.2.2.6-1.7.aarch64.rpm"
RPM_HASH = "a6ced36250c305a224d71b957f33b6c2c12b711d0844a2997dd78aa8679cf636405aa4ca1bd9b5f4a3b69d14bc9eb58de35bf32b035b9ff369f816992a6ca1ee"

RPROVIDES:${PN} += "ghc-prof-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-streaming-commons-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-process-1.6.16.0 \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-stm-2.5.1.0 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-streaming-commons-devel"

inherit rpm
