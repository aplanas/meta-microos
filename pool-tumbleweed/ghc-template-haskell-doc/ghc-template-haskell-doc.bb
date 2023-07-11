SUMMARY = "Haskell template-haskell library documentation"
DESCRIPTION = "This package provides the Haskell template-haskell library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-doc-2.19.0.0-3.2.noarch.rpm"
RPM_HASH = "f4c97d8b7da1fb6133cc87cf56e0948f5471b6909400638e5b31e9ca3f081b3c0fa3267759bc8e8f81255f6f5d81e19d07720f07a725ba2f983f8c1d3668862b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-template-haskell-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
