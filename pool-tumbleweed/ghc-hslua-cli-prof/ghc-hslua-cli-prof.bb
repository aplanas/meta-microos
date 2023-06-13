SUMMARY = "Haskell hslua-cli profiling library"
DESCRIPTION = "This package provides the Haskell hslua-cli profiling library."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "ghc-hslua-cli-prof-1.4.1-1.2.aarch64.rpm"
RPM_HASH = "7afee4d5d5286632995130ebe03a95aa9d7418e631eb0e21113a2e66b908fb99a604212631aef5afd86115a5cd7a809c2f1dfff6820f0cac9933e9b5b59fe239"

RPROVIDES:${PN} += "ghc-hslua-cli-prof \
ghc-hslua-cli-prof(aarch-64) \
ghc-prof(hslua-cli-1.4.1-EEaz0ST6ErtHZSjIcYe3Kp)"

RDEPENDS:${PN} += "ghc-hslua-cli-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-prof(hslua-repl-0.1.1-Cn1WzYftAVL4Hlxy0N0ea1) \
ghc-prof(lua-2.3.1-16mGxirchUh4T3oJJYdFzu) \
ghc-prof(text-2.0.2) \
ghc-prof(unix-2.7.3)"

inherit rpm
