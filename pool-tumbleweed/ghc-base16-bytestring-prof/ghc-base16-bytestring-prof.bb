SUMMARY = "Haskell base16-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell base16-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-prof-1.0.2.0-2.3.aarch64.rpm"
RPM_HASH = "8b7cf4f1dc385cf09afba4dfd5bf86395ea31fb3deb68874f1299c4216cb7299afcb230513ddcb3ee1d1c6bd0639ea1152be15a03bb84713d74652e7e0072819"

RPROVIDES:${PN} += "ghc-base16-bytestring-prof \
ghc-prof-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ"

RDEPENDS:${PN} += "ghc-base16-bytestring-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
