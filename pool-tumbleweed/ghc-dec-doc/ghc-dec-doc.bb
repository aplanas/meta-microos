SUMMARY = "Haskell dec library documentation"
DESCRIPTION = "This package provides the Haskell dec library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "ghc-dec-doc-0.0.5-2.4.noarch.rpm"
RPM_HASH = "e01030c6239669b57a5d683f748c83e0a927ca89765aa4a96e18a6df25c551635e1032fce4c202595a8dc334fd3106a689ba2abb46c3b084c597205958e89776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
