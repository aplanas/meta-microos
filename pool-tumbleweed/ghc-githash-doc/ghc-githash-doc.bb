SUMMARY = "Haskell githash library documentation"
DESCRIPTION = "This package provides the Haskell githash library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.0"

RPM_NAME = "ghc-githash-doc-0.1.7.0-1.3.noarch.rpm"
RPM_HASH = "77c2c037f2fd5a7f0649641de8d8810f906b62fe06acc41dcfb410112e806b440da6c5416d34b71b16f40f3ad05d0390094f9cb394127828ba51b21e9ebe232d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-githash-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
