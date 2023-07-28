SUMMARY = "Haskell skylighting-format-ansi library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-devel-0.1-2.5.aarch64.rpm"
RPM_HASH = "fcd5ec67a80f0fa09c29fbb1959953c96ac81f22d82213f4468ff04b2da41811d4fa11c6eb6fee535dbe6f06657be5cfaba6fe1d04a8f3951c9519b6a52d2c64"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-ansi-0.1-Bs7UZk06X7gCvm9EWhhFHl \
ghc-skylighting-format-ansi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4-ILWFndoUOH7DzXIN7Ztglj \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-ansi"

inherit rpm
