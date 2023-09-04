SUMMARY = "Haskell lukko library documentation"
DESCRIPTION = "This package provides the Haskell lukko library documentation."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.1.3"

RPM_NAME = "ghc-lukko-doc-0.1.1.3-5.8.noarch.rpm"
RPM_HASH = "ab8c8e23f9b44bd4082bb709167fb8b23721ce3f93c0a14c79f0eb91a91e88848a03a00561f421a006f15d5f5e2215e5bd98ee33a0bb42d1c7402a81465bffb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lukko-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
