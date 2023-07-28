SUMMARY = "Haskell skylighting-format-blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-doc-0.1.1-2.5.noarch.rpm"
RPM_HASH = "12a45af3cb7862a3e307e018b88bb8c2e079ea5016f21ad2d660137f9f97131f0870d885cf42c7d9d78d7572a86c76b3025e87d75875d6215b1ef99e9a9a15e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
