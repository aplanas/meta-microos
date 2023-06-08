SUMMARY = "Haskell http-client library documentation"
DESCRIPTION = "This package provides the Haskell http-client library documentation."
LICENSE = "MIT"

PV = "0.7.13.1"

RPM_NAME = "ghc-http-client-doc-0.7.13.1-3.4.noarch.rpm"
RPM_HASH = "0f43c51f54283ebfef338a0f3aa4debc99a85a8e528990b7b7e50c840fb9d84615f4265833baca92054dc4ba52b28688c8c8178c0470c563097fe2a04593fb6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
