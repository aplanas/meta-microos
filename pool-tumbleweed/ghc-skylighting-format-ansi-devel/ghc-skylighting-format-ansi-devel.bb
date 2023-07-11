SUMMARY = "Haskell skylighting-format-ansi library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-devel-0.1-2.4.aarch64.rpm"
RPM_HASH = "145ff887ae82e4d9bbde0f7baa1e305f1448d92b8f62e9905d14504fab1062123a97b2166736546aa89007d380cdca0e2d3b190677c64f76048525c2fab8ef37"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-ansi-0.1-7wsekCwokAw5Lqh6kWpqBT \
ghc-skylighting-format-ansi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-ansi"

inherit rpm
