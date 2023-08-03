SUMMARY = "Haskell skylighting-format-ansi library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-devel-0.1-2.6.aarch64.rpm"
RPM_HASH = "0b4c2ca9452b620de1d704253bcd6a86a2d5a775d70bbc0b2d3c72ff3772c085420b6fb03695d0e15a9db333697a8f89575f3db05dd9c53b5c71f5a167eb38ea"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-ansi-0.1-6378BOa13TnAAEhx7jAIGl \
ghc-skylighting-format-ansi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-6Bsu3Qo0E1u1DqUSYo1bSc \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-ansi"

inherit rpm
