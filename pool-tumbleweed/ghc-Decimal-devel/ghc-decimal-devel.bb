SUMMARY = "Haskell Decimal library development files"
DESCRIPTION = "This package provides the Haskell Decimal library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-devel-0.5.2-2.3.aarch64.rpm"
RPM_HASH = "728a14342e33de059f2c03c843d889b584b2e0a3163df473b159517373ff433682b4fd3abefa5870622639b7af0a3e725bf6b7e29a6876c5fca2346af0d8660e"

RPROVIDES:${PN} += "ghc-Decimal-devel \
ghc-devel-Decimal-0.5.2-7hu5LwisxJT2rqtwM7eQhT"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-Decimal \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0"

inherit rpm
