SUMMARY = "Haskell xml-hamlet library documentation"
DESCRIPTION = "This package provides the Haskell xml-hamlet library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-doc-0.5.0.2-2.4.noarch.rpm"
RPM_HASH = "49ee036523eca1d2a7d6fbe3e8d735bbfab7d11c416c6f598654ec0e67f2f04543fd54e49e7c88b664d950fe4492bcfc0d5e622be995b47689590619f592237a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-hamlet-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
