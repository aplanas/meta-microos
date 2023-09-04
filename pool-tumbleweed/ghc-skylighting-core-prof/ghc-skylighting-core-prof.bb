SUMMARY = "Haskell skylighting-core profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-core-prof-0.13.4.1-1.5.aarch64.rpm"
RPM_HASH = "a226af959d042fac4f5b4223fa013ca71592914c0378578ce433ba791607c6c5bb7d8b1b5e887bdfe35b30ff9ce992c2ffa0657c751000d1246d8d4affb5da2e"

RPROVIDES:${PN} += "ghc-prof-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-skylighting-core-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-colour-2.3.6-GBcey48GJNAK3398XtiZDq \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-prof-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-skylighting-core-devel"

inherit rpm
