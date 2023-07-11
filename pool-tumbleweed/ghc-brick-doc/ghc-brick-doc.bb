SUMMARY = "Haskell brick library documentation"
DESCRIPTION = "This package provides the Haskell brick library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ghc-brick-doc-1.6-2.8.noarch.rpm"
RPM_HASH = "26b937d092a7e7bd44bdcc3a000414677091dfd57cacc7c95b33b4606f9a36d6f2ba2d655017d233016d191ef20e0af599da0a0fd022b0ef936d0a0d909157ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-brick-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
