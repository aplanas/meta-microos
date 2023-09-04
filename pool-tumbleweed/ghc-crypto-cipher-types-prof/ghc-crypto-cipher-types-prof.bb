SUMMARY = "Haskell crypto-cipher-types profiling library"
DESCRIPTION = "This package provides the Haskell crypto-cipher-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-prof-0.0.9-4.8.aarch64.rpm"
RPM_HASH = "ec6a9b9a51c98b5ddcec0e00f3ebf244179342c9e76c58fd7d5a941c9819c33c0c049ba9050d01b62cd4a00850a380735f8225d383ab45eb7025fe8c3ab46084"

RPROVIDES:${PN} += "ghc-crypto-cipher-types-prof \
ghc-prof-crypto-cipher-types-0.0.9-6FlBjXMHauN3ENUNZLdeKl"

RDEPENDS:${PN} += "ghc-crypto-cipher-types-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-securemem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4"

inherit rpm
