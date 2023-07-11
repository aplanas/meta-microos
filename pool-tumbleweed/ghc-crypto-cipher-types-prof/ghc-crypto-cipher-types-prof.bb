SUMMARY = "Haskell crypto-cipher-types profiling library"
DESCRIPTION = "This package provides the Haskell crypto-cipher-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-prof-0.0.9-4.6.aarch64.rpm"
RPM_HASH = "ce98b1e5dccbe07ba70ed3e46265c4219e1d5921e699edc4d3f16c950ad6bddad2267c1fe63020f789b2ba2d23291f0a3e85f61027e5ec1b930cf8031bbe08d5"

RPROVIDES:${PN} += "ghc-crypto-cipher-types-prof \
ghc-prof-crypto-cipher-types-0.0.9-9ncnLpjReeQDgkKFRi4kUz"

RDEPENDS:${PN} += "ghc-crypto-cipher-types-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-securemem-0.1.10-14D6arGPELi9Mzd7V4Fyfu"

inherit rpm
