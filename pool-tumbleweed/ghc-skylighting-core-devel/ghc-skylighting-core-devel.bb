SUMMARY = "Haskell skylighting-core library development files"
DESCRIPTION = "This package provides the Haskell skylighting-core library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-core-devel-0.13.4.1-1.5.aarch64.rpm"
RPM_HASH = "304e742f3e219addf118b69f7b9b3338c45c8dcb595914036243dd389d266f0f445d702d253ec679eb0090a824161d855fbad647e3e5ea952722ec5b0e1f82ea"

RPROVIDES:${PN} += "ghc-devel-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-skylighting-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-colour-2.3.6-GBcey48GJNAK3398XtiZDq \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-devel-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-skylighting-core"

inherit rpm
