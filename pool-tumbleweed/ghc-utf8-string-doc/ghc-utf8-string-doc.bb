SUMMARY = "Haskell utf8-string library documentation"
DESCRIPTION = "This package provides the Haskell utf8-string library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-doc-1.0.2-2.6.noarch.rpm"
RPM_HASH = "03529e6c45b86d9f41c0bf0c9cafdc2afd28a41fe056f540b5a1399f6a8a172e88e1b55c5a12765675019c857ae0ba7118ccbebb11d8f0126c052a4c00f56a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-utf8-string-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
