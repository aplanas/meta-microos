SUMMARY = "Haskell texmath profiling library"
DESCRIPTION = "This package provides the Haskell texmath profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-prof-0.12.8-1.2.aarch64.rpm"
RPM_HASH = "18cd0201647aa9d8c1cfe38246e7b3582e02f2fbe232a4f955ff0b778295025d7e495f66c8c1c39c22b841319d992cfb2547ee6cebdee2e2f69fab81dc155977"

RPROVIDES:${PN} += "ghc-prof-texmath-0.12.8-JGsJwuKtD7b26p8DVW0WBw \
ghc-texmath-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-prof-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-prof-text-2.0.2 \
ghc-prof-typst-symbols-0.1.0.1-68asM8ctSWGeebFauBl8u \
ghc-prof-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-texmath-devel"

inherit rpm
