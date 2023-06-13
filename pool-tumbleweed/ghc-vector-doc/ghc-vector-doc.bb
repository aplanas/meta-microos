SUMMARY = "Haskell vector library documentation"
DESCRIPTION = "This package provides the Haskell vector library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.0.0"

RPM_NAME = "ghc-vector-doc-0.13.0.0-1.3.noarch.rpm"
RPM_HASH = "7d342cc6c23e7b415d432f123c38db0eab5f463d1259ba2a7d38b660a293d13a4e3d17c33f344c48ccdc94ec90ed8d52b71d2da92a26b42ca005861b30697631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
