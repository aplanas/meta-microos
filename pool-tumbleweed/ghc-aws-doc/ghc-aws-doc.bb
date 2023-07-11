SUMMARY = "Haskell aws library documentation"
DESCRIPTION = "This package provides the Haskell aws library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.23"

RPM_NAME = "ghc-aws-doc-0.23-1.7.noarch.rpm"
RPM_HASH = "fa7362997c970ce6e442db1ca5f1546cf9efbc3bb25f27f3af1db1218f67203f494514add17f45677b72c5129398525973dd5b26afe9a084ea05b7be69d57a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aws-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
