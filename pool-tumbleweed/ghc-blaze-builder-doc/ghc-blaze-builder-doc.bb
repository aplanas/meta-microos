SUMMARY = "Haskell blaze-builder library documentation"
DESCRIPTION = "This package provides the Haskell blaze-builder library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.3"

RPM_NAME = "ghc-blaze-builder-doc-0.4.2.3-1.1.noarch.rpm"
RPM_HASH = "2150cb41f320bc76811fa12d025439664fbc0000f3a0d3ab61f61d9c2c3e8e0d8d44fe16f1617f10f0cca6aa3f750ca5fa4d7909b7c53fe20f75ff3a92e40475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-builder-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
