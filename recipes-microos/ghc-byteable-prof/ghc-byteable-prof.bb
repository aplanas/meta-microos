SUMMARY = "Haskell byteable profiling library"
DESCRIPTION = "This package provides the Haskell byteable profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-byteable-prof-0.1.1-12.2.aarch64.rpm"
RPM_HASH = "3cef0dda1ae85c5496723b5f062ae488d00145ff279b637abc56f330ad196dcfec31bfcf1fea4fb3c215d03ffc4e715782fccf6618d1e5724221bc41634a7ebd"

RPROVIDES:${PN} += "ghc-byteable-prof \
ghc-byteable-prof(aarch-64) \
ghc-prof(byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg)"
RDEPENDS:${PN} += "ghc-byteable-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0)"

inherit rpm
