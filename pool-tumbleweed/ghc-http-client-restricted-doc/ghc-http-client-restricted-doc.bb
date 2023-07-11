SUMMARY = "Haskell http-client-restricted library documentation"
DESCRIPTION = "This package provides the Haskell http-client-restricted library documentation."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-doc-0.0.5-2.4.noarch.rpm"
RPM_HASH = "8c5aa35c8b3b8d096aac4e3089b54fe3a1ae305195b67f5c47e1f009c4d25c07cb665e6b9ed1334532aba508017c065ca25e09a65b1e14c0a983752028f3f9ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-restricted-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
