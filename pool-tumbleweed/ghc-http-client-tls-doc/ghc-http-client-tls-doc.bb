SUMMARY = "Haskell http-client-tls library documentation"
DESCRIPTION = "This package provides the Haskell http-client-tls library documentation."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-doc-0.3.6.1-2.7.noarch.rpm"
RPM_HASH = "fe8590beb1db4e85e31c61cfad1cc13619f76d6ddb6df9cff554f7b238a3caebbf3aa08d0223e76d59ef25a7237b656a3b2101e3e4becaa8333d38f681c4873f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
