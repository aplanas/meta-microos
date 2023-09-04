SUMMARY = "Haskell xml-conduit library documentation"
DESCRIPTION = "This package provides the Haskell xml-conduit library documentation."
LICENSE = "MIT"

PV = "1.9.1.3"

RPM_NAME = "ghc-xml-conduit-doc-1.9.1.3-1.6.noarch.rpm"
RPM_HASH = "903434142cb5d61ace2a5a4f9f14dfe06f374a4308ea0391fad173770a2e92a634ebdfa19971893ac2ac3820b56a6af7d591bf40141069dd14d45623342f3bc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
