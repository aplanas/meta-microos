SUMMARY = "Haskell pandoc library documentation"
DESCRIPTION = "This package provides the Haskell pandoc library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.2"

RPM_NAME = "ghc-pandoc-doc-3.1.2-1.3.noarch.rpm"
RPM_HASH = "046ac962cee8aa92e7361aca25eac4279490d2a34c25c86c3cdce06cf5b4df3ff74b7415514d15a2a0fee3087fe2fb18acde9553276e2363a7f49a928e1ef8bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
