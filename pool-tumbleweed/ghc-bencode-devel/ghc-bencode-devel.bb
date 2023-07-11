SUMMARY = "Haskell bencode library development files"
DESCRIPTION = "This package provides the Haskell bencode library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-devel-0.6.1.1-4.6.aarch64.rpm"
RPM_HASH = "25f248639bdc78cbd8e448465b3f4fb2b880354e1f42703201cb6180c3c6b027fd06bb76141abba866872c48ce1d8b753c258474357ecee711eda3c9efc0520d"

RPROVIDES:${PN} += "ghc-bencode-devel \
ghc-devel-bencode-0.6.1.1-GM7FbH3LNxfAWaUPR0lH5w"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bencode \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd"

inherit rpm
