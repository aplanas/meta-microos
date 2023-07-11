SUMMARY = "Haskell invariant library documentation"
DESCRIPTION = "This package provides the Haskell invariant library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-invariant-doc-0.6.1-1.6.noarch.rpm"
RPM_HASH = "c2119fc0910916ca834f51c56314256385ddefe0517070678456cce3fc9a2aef4f7f9c7166a1040137e5e473e5a0ffe2dabfd47cbba600a98018b9c6467b983f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-invariant-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
