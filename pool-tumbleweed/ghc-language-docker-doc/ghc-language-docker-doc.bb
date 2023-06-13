SUMMARY = "Haskell language-docker library documentation"
DESCRIPTION = "This package provides the Haskell language-docker library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "11.0.0"

RPM_NAME = "ghc-language-docker-doc-11.0.0-1.3.noarch.rpm"
RPM_HASH = "c1a267e03a31309a131bb7d3f45ecc75d10835b07f84113733707ac99e7aeb8f7fad4aa7667b7d9fd18dbde99f8536e00b836448d25ba32387b7ac38a4030bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-docker-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
