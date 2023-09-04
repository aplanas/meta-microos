SUMMARY = "Haskell Only library development files"
DESCRIPTION = "This package provides the Haskell Only library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-Only-devel-0.1-6.1.aarch64.rpm"
RPM_HASH = "3390e677f52d2479f544102ef41b9c5885a68b56924d87ad98f304ecaa7c8d29aff7b9e8391b336768a97c6c612687184d5889a519501bd696f525908955143b"

RPROVIDES:${PN} += "ghc-Only-devel \
ghc-devel-Only-0.1-qCrN026ulaL2ZFxnlcrV1"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-Only \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0"

inherit rpm
