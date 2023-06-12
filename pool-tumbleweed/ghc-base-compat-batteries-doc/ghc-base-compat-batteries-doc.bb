SUMMARY = "Haskell base-compat-batteries library documentation"
DESCRIPTION = "This package provides the Haskell base-compat-batteries library documentation."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "ghc-base-compat-batteries-doc-0.12.2-2.3.noarch.rpm"
RPM_HASH = "f1b0d8c56f5e95a8ad4680a459a1ca63c50dcc98e3ddcce170305f8c80ca62c3d71992fbc8c066248cce2d1d8771422e06ef94845cd444d303ad447ea0c679b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-compat-batteries-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
