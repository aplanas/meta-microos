SUMMARY = "Haskell socks library documentation"
DESCRIPTION = "This package provides the Haskell socks library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-doc-0.6.1-6.7.noarch.rpm"
RPM_HASH = "1a4f8520811b77affa06ec7bed9ead9211379be93b0f889c62e7e417c6790df628d3295dda2b35bae32d4538a8472d96d28160cbd047e317748cf2ef03fb56f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-socks-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
