SUMMARY = "Haskell skylighting-format-latex library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-devel-0.1-2.4.aarch64.rpm"
RPM_HASH = "a54790b300fa3ebc61a420260fc643033ffeb760fa6ca2331928dccf46649bf3678c2e88285b827aa714947a968d5fbb494a1e4e52dadb3ae119746e0bb98a1c"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-latex-0.1-8E2kKavCeIp7J2nfRBTdHs \
ghc-skylighting-format-latex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-latex"

inherit rpm
