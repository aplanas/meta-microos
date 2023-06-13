SUMMARY = "Haskell yesod-persistent library documentation"
DESCRIPTION = "This package provides the Haskell yesod-persistent library documentation."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-doc-1.6.0.8-2.4.noarch.rpm"
RPM_HASH = "00411dd10fef2c1c3ea86dae13a9d0000c65affba9aaadd86cc1322384727fca7e85469caf8507d324c05517d5cd630988cc5265aac3bf9d4b8c24757ee695bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
