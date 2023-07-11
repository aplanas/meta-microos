SUMMARY = "Haskell hslua-core profiling library"
DESCRIPTION = "This package provides the Haskell hslua-core profiling library."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-prof-2.3.1-1.6.aarch64.rpm"
RPM_HASH = "93faa33c89963d72d03ecd9a2ed28b898c7ffbab210f25dcd2652a0002109a0daf570105b19165bf59dc42800947ccaa4e952bd04dab5d11645e8310774f59a8"

RPROVIDES:${PN} += "ghc-hslua-core-prof \
ghc-prof-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC"

RDEPENDS:${PN} += "ghc-hslua-core-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-lua-2.3.1-16mGxirchUh4T3oJJYdFzu \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
