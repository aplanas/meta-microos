SUMMARY = "Haskell http-client-restricted library documentation"
DESCRIPTION = "This package provides the Haskell http-client-restricted library documentation."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-doc-0.0.5-2.8.noarch.rpm"
RPM_HASH = "12f8dcc69d2e52cba2a1dd64c2332db843b4bc47cbb61c1549da8f0e4b2ccf2d8516d2787e5882f09fe00728dc5b367ec8bb12c06d8900b1c0aab607674c9531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-restricted-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
