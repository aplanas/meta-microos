SUMMARY = "Haskell skylighting-format-ansi profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-prof-0.1-2.5.aarch64.rpm"
RPM_HASH = "33603d6445a71adb1e7e19c872748289c35378f3ac62e810ef7b92c138c14613c2928a056bffdbbc60b889f2151faf43b2a847378e596a8f0bd8a95e7c8c312d"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-ansi-0.1-Bs7UZk06X7gCvm9EWhhFHl \
ghc-skylighting-format-ansi-prof"

RDEPENDS:${PN} += "ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4-ILWFndoUOH7DzXIN7Ztglj \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-ansi-devel"

inherit rpm
