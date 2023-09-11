SUMMARY = "Haskell setlocale library development files"
DESCRIPTION = "This package provides the Haskell setlocale library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-devel-1.0.0.10-5.1.aarch64.rpm"
RPM_HASH = "49911286c27aae5e004b176d00f478130a985f8a17c5a065c203bd2f8d4d2d2df2fd9581d8e6eb8c8215d804ca7a431a64563c2ef2784bdcdfcf5229ae0c6eff"

RPROVIDES:${PN} += "ghc-devel-setlocale-1.0.0.10-EX0ACS22UctCUxDRUitp1V \
ghc-setlocale-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-setlocale"

inherit rpm
