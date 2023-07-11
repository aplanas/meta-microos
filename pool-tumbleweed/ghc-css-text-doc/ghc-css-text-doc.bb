SUMMARY = "Haskell css-text library documentation"
DESCRIPTION = "This package provides the Haskell css-text library documentation."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-doc-0.1.3.0-4.6.noarch.rpm"
RPM_HASH = "cf6d6c3a5b5a510f324aabb6542c6bc56e4e86748f9120a6c60dc05795220e716c324d697a379ae93438300b9935e1d3def0425861d5c4500bcbe8f0af0179b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-css-text-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
