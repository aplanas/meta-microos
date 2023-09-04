SUMMARY = "Haskell doctemplates profiling library"
DESCRIPTION = "This package provides the Haskell doctemplates profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-doctemplates-prof-0.11-1.7.aarch64.rpm"
RPM_HASH = "ad47aa7e08155a5b895494271141efd2fde6e0e7c5c55523d7dc3cdb986225037e7f61adb71cb6262b8f2d2764c8a66eba7344d2f64ced68665b1502a758a100"

RPROVIDES:${PN} += "ghc-doctemplates-prof \
ghc-prof-doctemplates-0.11-5YDqCtEHp1aBKjLF8JwQH7"

RDEPENDS:${PN} += "ghc-doctemplates-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-text-2.0.2 \
ghc-prof-text-conversions-0.3.1.1-HJG9QLMf9pVESk7Lf3iSH7 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
