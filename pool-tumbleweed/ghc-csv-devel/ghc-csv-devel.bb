SUMMARY = "Haskell csv library development files"
DESCRIPTION = "This package provides the Haskell csv library development files."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-devel-0.1.2-4.3.aarch64.rpm"
RPM_HASH = "1464ab787366dd73d8a90bf627a84e66a46545a9b2787b66d45eb646204b0bd68a3cc0977b56bf0a9f9824fd10674b9743b1042d6734291859afcf979d91fc43"

RPROVIDES:${PN} += "ghc-csv-devel \
ghc-devel-csv-0.1.2-D7ZtQLgQlciDV3aF4oWKCf"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-csv \
ghc-devel-base-4.17.2.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-parsec-3.1.16.1"

inherit rpm
