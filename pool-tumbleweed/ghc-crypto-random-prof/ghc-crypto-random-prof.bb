SUMMARY = "Haskell crypto-random profiling library"
DESCRIPTION = "This package provides the Haskell crypto-random profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-prof-0.0.9-6.1.aarch64.rpm"
RPM_HASH = "e39a8cf902923c0c358e261e42be5df2ec238e9f311ef3802b568d608ffb211ecb38e92affba864dcc6b5fab26a1db9fdbd5d3ae68a8f3cdf94a198b31f4ca72"

RPROVIDES:${PN} += "ghc-crypto-random-prof \
ghc-prof-crypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw"

RDEPENDS:${PN} += "ghc-crypto-random-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-securemem-0.1.10-14D6arGPELi9Mzd7V4Fyfu \
ghc-prof-unix-2.7.3 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
