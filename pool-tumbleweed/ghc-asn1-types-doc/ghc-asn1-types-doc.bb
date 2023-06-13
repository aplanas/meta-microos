SUMMARY = "Haskell asn1-types library documentation"
DESCRIPTION = "This package provides the Haskell asn1-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-doc-0.3.4-5.3.noarch.rpm"
RPM_HASH = "8e8c76b76ee36f6ca193b5eb555facffffb8d80592dcdbd4ce0af9595b92dff97dde2539e53ba275f070135849d0783abc87766798d8237666ca5fbab3975d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
