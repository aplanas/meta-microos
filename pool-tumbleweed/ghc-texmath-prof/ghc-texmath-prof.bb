SUMMARY = "Haskell texmath profiling library"
DESCRIPTION = "This package provides the Haskell texmath profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7.1"

RPM_NAME = "ghc-texmath-prof-0.12.7.1-1.3.aarch64.rpm"
RPM_HASH = "93c5f5daef8398cee8d7bbc129fc5b5a09b8552a2fefda40266291223df47384e4f78492fa9e734832d0527edae17c4f4f86db132b61df3beffad2addc2a02c6"

RPROVIDES:${PN} += "ghc-prof-texmath-0.12.7.1-7OWYB1fHEsHAa3KAfzQAEj \
ghc-texmath-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pandoc-types-1.23-EFziwPO22I72D2SxHphq63 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-prof-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-prof-text-2.0.2 \
ghc-prof-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-texmath-devel"

inherit rpm
