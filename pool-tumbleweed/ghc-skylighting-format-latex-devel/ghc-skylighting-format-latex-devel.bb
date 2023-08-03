SUMMARY = "Haskell skylighting-format-latex library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-devel-0.1-2.6.aarch64.rpm"
RPM_HASH = "7ed339c9d0c4a29ca67ba244b1a96eded16d32ba9925b5668b9f3aa6832161cf304448764e3896a89bdc03e8bd1bfb72577c60162db24fe2ddd6d6a6a79ee11e"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-latex-0.1-J2O8wjQxddL48jSKv998Ye \
ghc-skylighting-format-latex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-6Bsu3Qo0E1u1DqUSYo1bSc \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-latex"

inherit rpm
