SUMMARY = "Haskell texmath library development files"
DESCRIPTION = "This package provides the Haskell texmath library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-devel-0.12.8-1.4.aarch64.rpm"
RPM_HASH = "5d677ea7b75e00907c68b1b48ffce5affb010c2e844bc2bf1debb9d889e1e715bb1a5f1575ce6a24a7917095f9041c9047d488604243c5f74a87a39a483133b1"

RPROVIDES:${PN} += "ghc-devel-texmath-0.12.8-2ewx8lB0RHk1Ql4916ePbT \
ghc-texmath-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-devel-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-devel-text-2.0.2 \
ghc-devel-typst-symbols-0.1.2-6B3ZvJm94WZ4qfFjRZShld \
ghc-devel-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-texmath"

inherit rpm
