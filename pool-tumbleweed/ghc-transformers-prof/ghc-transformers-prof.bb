SUMMARY = "Haskell transformers profiling library"
DESCRIPTION = "This package provides the Haskell transformers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-prof-0.5.6.2-1.1.aarch64.rpm"
RPM_HASH = "7ad9f247551da7726f1f736347459aa6692f99e79e0566abfe3dd18fc24820d701ed899888c4fc241f7ec3d311cb1ea96644c36d5d8ae07acc78a3360e5a3273"

RPROVIDES:${PN} += "ghc-prof-transformers-0.5.6.2 \
ghc-transformers-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-transformers-devel"

inherit rpm
