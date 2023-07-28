SUMMARY = "Haskell texmath profiling library"
DESCRIPTION = "This package provides the Haskell texmath profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-prof-0.12.8-1.4.aarch64.rpm"
RPM_HASH = "d90ec2fe0d9e48e58e00837620e2f0740d03b4e1b88462e900f0d98872d58cbc7448b9b41ca96fd1f381f2e821a3ecfb6cbe1eeac35963452843f77fff709d03"

RPROVIDES:${PN} += "ghc-prof-texmath-0.12.8-2ewx8lB0RHk1Ql4916ePbT \
ghc-texmath-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-prof-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-prof-text-2.0.2 \
ghc-prof-typst-symbols-0.1.2-6B3ZvJm94WZ4qfFjRZShld \
ghc-prof-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-texmath-devel"

inherit rpm
