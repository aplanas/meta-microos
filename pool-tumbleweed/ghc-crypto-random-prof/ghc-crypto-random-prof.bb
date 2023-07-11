SUMMARY = "Haskell crypto-random profiling library"
DESCRIPTION = "This package provides the Haskell crypto-random profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-prof-0.0.9-5.6.aarch64.rpm"
RPM_HASH = "4ef2611b160da02625694569327e3203cd8a0559ddf77d9654f689f228fed6413f9ea68a7313a31b17b144a3f0663cd3534a5937c88d0dd5c6c5a989c0ba864f"

RPROVIDES:${PN} += "ghc-crypto-random-prof \
ghc-prof-crypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw"

RDEPENDS:${PN} += "ghc-crypto-random-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-securemem-0.1.10-14D6arGPELi9Mzd7V4Fyfu \
ghc-prof-unix-2.7.3 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
