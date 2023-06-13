SUMMARY = "Haskell regex-posix library documentation"
DESCRIPTION = "This package provides the Haskell regex-posix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-doc-0.96.0.1-3.3.noarch.rpm"
RPM_HASH = "fb9e193767ad2e486ac2977a789fd714b471369303b370d7d9acb8b8a8a75071a1c883b45d32fa64be4b9ab3e806b1b10d1e6d1b96c56a5132e0cd1cd0183842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-posix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
