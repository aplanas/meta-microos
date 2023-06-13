SUMMARY = "Haskell ansi-terminal-types profiling library"
DESCRIPTION = "This package provides the Haskell ansi-terminal-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-types-prof-0.11.5-1.2.aarch64.rpm"
RPM_HASH = "dac499432cb74a54c0b60d978c0d8d79e166bc61cb3e24a755573c262416954049f9cd0b4810e009b205de9a9975034f8b97ae95a5093de00e14b2a0e144e22a"

RPROVIDES:${PN} += "ghc-ansi-terminal-types-prof \
ghc-ansi-terminal-types-prof(aarch-64) \
ghc-prof(ansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR)"

RDEPENDS:${PN} += "ghc-ansi-terminal-types-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln)"

inherit rpm
