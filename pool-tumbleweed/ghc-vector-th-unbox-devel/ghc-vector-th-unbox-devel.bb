SUMMARY = "Haskell vector-th-unbox library development files"
DESCRIPTION = "This package provides the Haskell vector-th-unbox library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-vector-th-unbox-devel-0.2.2-4.3.aarch64.rpm"
RPM_HASH = "8538e03718a5f6f6fc836e03f2cb8f17c41b1eed3e710da6cba1d955cb22ed896723a9828b6eb380d286feb37a73015084802db31a841a238e15950d8c8543bd"

RPROVIDES:${PN} += "ghc-devel-vector-th-unbox-0.2.2-4Hl5syaTqnL4b2rNrCiqzQ \
ghc-vector-th-unbox-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-vector-th-unbox"

inherit rpm
