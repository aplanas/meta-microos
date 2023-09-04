SUMMARY = "Haskell extensible-exceptions library documentation"
DESCRIPTION = "This package provides the Haskell extensible-exceptions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-doc-0.1.1.4-7.3.noarch.rpm"
RPM_HASH = "0564ddc9e585cc256ab62e31192a231a03671a7dc07f1cb7db959ee59da471b39514db8b06d3d70d3e74d1bb91d727b628b9a772b948716adf6f8f944b6f7043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-extensible-exceptions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
