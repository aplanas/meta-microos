SUMMARY = "Haskell data-clist library documentation"
DESCRIPTION = "This package provides the Haskell data-clist library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-doc-0.2-2.2.noarch.rpm"
RPM_HASH = "2edb28db10505107e7dadf6d74db3f4b83e5c54ee060358d41f34ec4628c98008d640657eb030e28ac7679388d0978315c9e83c15949b35e08f4578b376e669f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-clist-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
