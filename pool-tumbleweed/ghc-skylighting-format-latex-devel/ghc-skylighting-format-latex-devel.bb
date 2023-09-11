SUMMARY = "Haskell skylighting-format-latex library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-devel-0.1-2.11.aarch64.rpm"
RPM_HASH = "f5ff67aa3e0022bb8de63430c8017a60fc3ca10878a4c1c2ffe5a6d6fa8fcaaab2c1c89724b710a6b474de95ae6259bd6008f1011b800ebfe2f7323bffafab0f"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-latex-0.1-8a642fGNkPX9imnZQBlyrP \
ghc-skylighting-format-latex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-LOkep7AnSNN7QJDAXr031n \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-latex"

inherit rpm
