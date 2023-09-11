SUMMARY = "Haskell shakespeare library documentation"
DESCRIPTION = "This package provides the Haskell shakespeare library documentation."
LICENSE = "MIT"

PV = "2.0.30"

RPM_NAME = "ghc-shakespeare-doc-2.0.30-2.11.noarch.rpm"
RPM_HASH = "d3fe9898432f33bc7fad030b8c98eea4d4580cc1821bc1485d5f5a1056f6fd29bde6d6a6d341850ebb4255c186feabf3acc079dbe6707c142d5a553d383a95ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-shakespeare-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
