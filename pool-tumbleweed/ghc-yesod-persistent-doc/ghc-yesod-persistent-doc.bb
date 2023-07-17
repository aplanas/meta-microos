SUMMARY = "Haskell yesod-persistent library documentation"
DESCRIPTION = "This package provides the Haskell yesod-persistent library documentation."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-doc-1.6.0.8-2.8.noarch.rpm"
RPM_HASH = "9383ccf9aa6d507f2a08b7f83c2982a4517a2820531c7f61ef5677d3edae851991cca5484465603612abc27dad691ca0294ae02a33fdb9b8e8184c78ef3e62eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
