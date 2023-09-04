SUMMARY = "Haskell async library documentation"
DESCRIPTION = "This package provides the Haskell async library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "ghc-async-doc-2.2.4-4.4.noarch.rpm"
RPM_HASH = "d8af71e77359c8e9017d6d60b11fb2a85f51c1ef2b988bf0c8559c196c6b251f0f7cd02842bb8765c9cb042045ebb5a0e065a8135f6d96119aa5bcf436d1abb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-async-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
