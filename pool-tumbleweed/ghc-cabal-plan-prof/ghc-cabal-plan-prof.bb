SUMMARY = "Haskell cabal-plan profiling library"
DESCRIPTION = "This package provides the Haskell cabal-plan profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2.3"

RPM_NAME = "ghc-cabal-plan-prof-0.7.2.3-1.3.aarch64.rpm"
RPM_HASH = "f590764c56756a559462d9f3fce9c83635432277b2a98c6180da74c2103d52782117ebdcde478931ea91387087865c3953b25eb0b0c7132c10c076fea66d5e53"

RPROVIDES:${PN} += "ghc-cabal-plan-prof \
ghc-prof-cabal-plan-0.7.2.3-5ryJl4z9bHqN70ORM7EbT"

RDEPENDS:${PN} += "ghc-cabal-plan-devel \
ghc-prof-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-prof-base-4.17.1.0 \
ghc-prof-base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
