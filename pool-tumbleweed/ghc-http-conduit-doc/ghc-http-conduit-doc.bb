SUMMARY = "Haskell http-conduit library documentation"
DESCRIPTION = "This package provides the Haskell http-conduit library documentation."
LICENSE = "BSD-2-Clause"

PV = "2.3.8.2"

RPM_NAME = "ghc-http-conduit-doc-2.3.8.2-2.6.noarch.rpm"
RPM_HASH = "d8ee256d9b8abe1595a2483cab125bba77ddd8728d1fedf0a6403660f553ffbc006d444eccc9c5ae90c2666037145aaa1d02380b969c1f561375398f6308cd16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
