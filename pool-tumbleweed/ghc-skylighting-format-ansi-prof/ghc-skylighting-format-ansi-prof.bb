SUMMARY = "Haskell skylighting-format-ansi profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-prof-0.1-2.6.aarch64.rpm"
RPM_HASH = "3270c86ef74aaa64c152b3c81f358c68a2d0174bfbea8c71e9fd83ce30f98fe9b15315c26493568b8b13e49221eda7dfa570465b960c0540a19afac41cb448e3"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-ansi-0.1-6378BOa13TnAAEhx7jAIGl \
ghc-skylighting-format-ansi-prof"

RDEPENDS:${PN} += "ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-6Bsu3Qo0E1u1DqUSYo1bSc \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-ansi-devel"

inherit rpm
