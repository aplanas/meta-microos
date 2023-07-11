SUMMARY = "Haskell feed library documentation"
DESCRIPTION = "This package provides the Haskell feed library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-doc-1.3.2.1-3.2.noarch.rpm"
RPM_HASH = "73188d1f76fae6d01512550ef054b6f38996855d9c046f76e4a0be7a2759d12cd002dba8f010fa519563c43aa29ddc8e33eeddf92c6c58123dfcd670ccba3535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-feed-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
