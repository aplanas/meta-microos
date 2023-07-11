SUMMARY = "Haskell Glob library documentation"
DESCRIPTION = "This package provides the Haskell Glob library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-doc-0.10.2-3.6.noarch.rpm"
RPM_HASH = "1b88766e774d8851484f0587d30322ccb8a331e87ef900d49d5ff2e18c12ee2122dd8edbc0b72fe6f8adbe16537c1e8c9392075d8f9e7d75453833a4b500c5c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Glob-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
