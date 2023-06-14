SUMMARY = "Haskell hslua-repl profiling library"
DESCRIPTION = "This package provides the Haskell hslua-repl profiling library."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ghc-hslua-repl-prof-0.1.1-1.2.aarch64.rpm"
RPM_HASH = "40d72bf2b8dd84653cbb5fa373da14c15aeb01dbd50c7d23bf998def91d1f48a79e3a0a3c5529f29ba70b31c0825e15cd773e28b516eb5cb72507e7fb0d0d5b3"

RPROVIDES:${PN} += "ghc-hslua-repl-prof \
ghc-prof-hslua-repl-0.1.1-Cn1WzYftAVL4Hlxy0N0ea1"

RDEPENDS:${PN} += "ghc-hslua-repl-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-prof-isocline-1.0.9-7x8dFWbXh69GJxYhigSqXG \
ghc-prof-lua-2.3.1-16mGxirchUh4T3oJJYdFzu \
ghc-prof-text-2.0.2"

inherit rpm
