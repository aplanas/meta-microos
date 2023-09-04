SUMMARY = "Haskell lucid profiling library"
DESCRIPTION = "This package provides the Haskell lucid profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-prof-2.11.20230408-1.5.aarch64.rpm"
RPM_HASH = "5f7083a543ab2d5df082db8364cb1bc72ae699604f80acba12521e25158303e6f39bfd51dd38cc413e5a7fe66ceda91d69ce620cbb209665a0549e4bad8e60ed"

RPROVIDES:${PN} += "ghc-lucid-prof \
ghc-prof-lucid-2.11.20230408-F37ejAzYfNaC9F9tMADx3y"

RDEPENDS:${PN} += "ghc-lucid-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-mmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
