SUMMARY = "Haskell foldl library documentation"
DESCRIPTION = "This package provides the Haskell foldl library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.15"

RPM_NAME = "ghc-foldl-doc-1.4.15-1.4.noarch.rpm"
RPM_HASH = "9d822c16900b0d563cc9bb4d01c673d69156a915252e2e7409fc8290cc17d6db8f7e08e4d3e33fc85fd74df3bf4db843989f610fe5e4db99faca119609dc7a10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-foldl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
