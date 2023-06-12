SUMMARY = "Haskell asn1-encoding library documentation"
DESCRIPTION = "This package provides the Haskell asn1-encoding library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-doc-0.9.6-8.3.noarch.rpm"
RPM_HASH = "e5e072ee8b24d27becb514bbda42128e7db79175a81ba02167821d4623c4dfbc9f9cb98c403ec49f124c86b020f09aacb5c92fd0dfa15693992519cf2ab6554c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-encoding-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
