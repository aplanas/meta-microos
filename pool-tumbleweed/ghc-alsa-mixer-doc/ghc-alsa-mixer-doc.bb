SUMMARY = "Haskell alsa-mixer library documentation"
DESCRIPTION = "This package provides the Haskell alsa-mixer library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-alsa-mixer-doc-0.3.0-4.2.noarch.rpm"
RPM_HASH = "35dfa54463b6b61d1671951d7fe2ece660a282e0dc470859be336d1a609781713e4a051d03a3db58d01eb961132c0c4694cf873a868554f98404213135d94a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-alsa-mixer-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
