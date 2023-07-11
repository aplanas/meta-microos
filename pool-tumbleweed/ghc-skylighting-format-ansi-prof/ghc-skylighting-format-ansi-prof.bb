SUMMARY = "Haskell skylighting-format-ansi profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-prof-0.1-2.4.aarch64.rpm"
RPM_HASH = "dd5ad95c3fd5dc2ab14665c7ca9c8b8431c1296dd91292a1963a4c7fab6003de1ee3d85cd588e4077ffc5e0fec508a7798489ca3b4eed5cc114c5b7e544a59bc"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-ansi-0.1-7wsekCwokAw5Lqh6kWpqBT \
ghc-skylighting-format-ansi-prof"

RDEPENDS:${PN} += "ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-ansi-devel"

inherit rpm
