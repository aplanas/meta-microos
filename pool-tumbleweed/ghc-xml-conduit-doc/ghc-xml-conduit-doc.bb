SUMMARY = "Haskell xml-conduit library documentation"
DESCRIPTION = "This package provides the Haskell xml-conduit library documentation."
LICENSE = "MIT"

PV = "1.9.1.2"

RPM_NAME = "ghc-xml-conduit-doc-1.9.1.2-1.4.noarch.rpm"
RPM_HASH = "a249e03a123e9dfc25f40618c76fea512f35747b8196ad1045bcc05a4e70fbcfc0522dd762b54d606b98cb0f32e30169211ad8835bcb5a6087a249ee7d3b15fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-conduit-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
