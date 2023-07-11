SUMMARY = "Haskell texmath library development files"
DESCRIPTION = "This package provides the Haskell texmath library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-devel-0.12.8-1.2.aarch64.rpm"
RPM_HASH = "a3a7e8a8ee484aeeda53354d5528c9f0e0f4a71511dfc2b81d945f9080ad9dbb0e768892b366941f8b4b924537537abaad285c892d6c81c138719da75de753c5"

RPROVIDES:${PN} += "ghc-devel-texmath-0.12.8-JGsJwuKtD7b26p8DVW0WBw \
ghc-texmath-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-devel-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-devel-text-2.0.2 \
ghc-devel-typst-symbols-0.1.0.1-68asM8ctSWGeebFauBl8u \
ghc-devel-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-texmath"

inherit rpm
