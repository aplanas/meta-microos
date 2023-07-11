SUMMARY = "Haskell HsYAML library documentation"
DESCRIPTION = "This package provides the Haskell HsYAML library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-doc-0.2.1.1-3.6.noarch.rpm"
RPM_HASH = "015a33161423ef9b23b5d19b6d71be595449e322559dcf9d7a4ae5a5b793dc251756256cb7555298a0458a41e0246b134b19717cdab16a66c42b59553df7d3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HsYAML-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
