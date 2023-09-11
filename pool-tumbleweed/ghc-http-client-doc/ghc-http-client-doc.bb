SUMMARY = "Haskell http-client library documentation"
DESCRIPTION = "This package provides the Haskell http-client library documentation."
LICENSE = "MIT"

PV = "0.7.14"

RPM_NAME = "ghc-http-client-doc-0.7.14-1.2.noarch.rpm"
RPM_HASH = "a78e46ca35d48b14a52b5832683d852bdeafdcd52d03630e7f48b38b16b91f3fec1cd4d21cef0f13e8cb881812c5858d9a59e70059114fd4d19841b6e334fa4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
