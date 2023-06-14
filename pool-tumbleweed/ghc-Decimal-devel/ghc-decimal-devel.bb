SUMMARY = "Haskell Decimal library development files"
DESCRIPTION = "This package provides the Haskell Decimal library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-devel-0.5.2-2.2.aarch64.rpm"
RPM_HASH = "56f08f68b1aa59ee274efd91aec7322f8d68738d5230b36fc95ac451b9d5e7d62002b5af6b5a56359853bfd1a59e887b6f1a0237b3c4d97cfc3a3c5031469215"

RPROVIDES:${PN} += "ghc-Decimal-devel \
ghc-devel-Decimal-0.5.2-1qhxZ7R9Om3AQz2LFWOWmX"

RDEPENDS:${PN} += "/bin/sh \
ghc-Decimal \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0"

inherit rpm
