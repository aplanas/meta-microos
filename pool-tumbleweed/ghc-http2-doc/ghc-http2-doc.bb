SUMMARY = "Haskell http2 library documentation"
DESCRIPTION = "This package provides the Haskell http2 library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-doc-3.0.3-2.14.noarch.rpm"
RPM_HASH = "0692a61104897914cd92485d0cb0f84c30e0330498dbdb3297dd1b0be2ff1d7ab4f2bf744111fadce44cc5f26d6ba5fd68cca5458d976c6655a70fa3cd61c6e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http2-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
