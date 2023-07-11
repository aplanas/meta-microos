SUMMARY = "Haskell http-client library documentation"
DESCRIPTION = "This package provides the Haskell http-client library documentation."
LICENSE = "MIT"

PV = "0.7.13.1"

RPM_NAME = "ghc-http-client-doc-0.7.13.1-3.7.noarch.rpm"
RPM_HASH = "b93c5391764d9b08b710211027d3c9d71a5f3298df1bc1ea49a6a2ac812e96f21679d187643dee8d117ea950f209c34c879c4ee23779b3f506fed014460fad0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
