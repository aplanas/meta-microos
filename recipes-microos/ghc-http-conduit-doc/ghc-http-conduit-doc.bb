SUMMARY = "Haskell http-conduit library documentation"
DESCRIPTION = "This package provides the Haskell http-conduit library documentation."
LICENSE = "BSD-2-Clause"

PV = "2.3.8"

RPM_NAME = "ghc-http-conduit-doc-2.3.8-2.4.noarch.rpm"
RPM_HASH = "2555c2dc1536b4dc95ffb43d96a8eae82762e9aa07c285db536f9eb2b4eaede12eeb84f688a0a0ee7b98ee3f72e206ad8885aa6c767b0523fb8e1b5e37576951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-conduit-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
