SUMMARY = "Haskell bencode profiling library"
DESCRIPTION = "This package provides the Haskell bencode profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-prof-0.6.1.1-4.8.aarch64.rpm"
RPM_HASH = "5022e49e912b8d57eb7cabd4b9e1730ebb0f8530e06f90e64c46c1930c7242b1c295f19474df0621b54064c3d30c72ceb1f1e7224cd8bc4ef1e53b6b52a2d584"

RPROVIDES:${PN} += "ghc-bencode-prof \
ghc-prof-bencode-0.6.1.1-26x5GmL2BHOEu40VootDht"

RDEPENDS:${PN} += "ghc-bencode-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM"

inherit rpm
