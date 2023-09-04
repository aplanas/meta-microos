SUMMARY = "Haskell attoparsec library development files"
DESCRIPTION = "This package provides the Haskell attoparsec library development files."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-attoparsec-devel-0.14.4-4.4.aarch64.rpm"
RPM_HASH = "5abdbee68b918543547862e78710c7c76b9ecc4a288ae01cecc7752d99341c13ae67be22c747f0dd4e7aec1dd5e2f45c8079cc4c206686a33b14044cb9ca0a71"

RPROVIDES:${PN} += "ghc-attoparsec-devel \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-attoparsec \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
