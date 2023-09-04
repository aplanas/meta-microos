SUMMARY = "Haskell lift-type profiling library"
DESCRIPTION = "This package provides the Haskell lift-type profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-lift-type-prof-0.1.1.1-2.3.aarch64.rpm"
RPM_HASH = "64b923ac7a1219d965708d6218ebf23bca959a8f5f3a5cb2caacd0e8b9ac4eda7bf1d16357821aa3cee011537a956ca80a58ec4a45afaac27d74cb5afc9dd1a3"

RPROVIDES:${PN} += "ghc-lift-type-prof \
ghc-prof-lift-type-0.1.1.1-4CMQtv7szwz8L9BvxxqTk1"

RDEPENDS:${PN} += "ghc-lift-type-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm
