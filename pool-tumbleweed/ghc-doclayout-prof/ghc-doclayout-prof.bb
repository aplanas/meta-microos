SUMMARY = "Haskell doclayout profiling library"
DESCRIPTION = "This package provides the Haskell doclayout profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-doclayout-prof-0.4.0.1-1.4.aarch64.rpm"
RPM_HASH = "f55dc52fe4fb1c5566bdc6d53fbe8e80fd7b45b74319fb4d05c0e19ea223d0c248cf274109a6caeeba544c1f1e81904e529fa12124bae4343b84c1eed3d78d75"

RPROVIDES:${PN} += "ghc-doclayout-prof \
ghc-prof-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc"

RDEPENDS:${PN} += "ghc-doclayout-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-emojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK \
ghc-prof-mtl-2.2.2 \
ghc-prof-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-prof-text-2.0.2"

inherit rpm
