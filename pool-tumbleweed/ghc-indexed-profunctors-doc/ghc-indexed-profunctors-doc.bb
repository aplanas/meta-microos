SUMMARY = "Haskell indexed-profunctors library documentation"
DESCRIPTION = "This package provides the Haskell indexed-profunctors library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-doc-0.1.1.1-1.2.noarch.rpm"
RPM_HASH = "d4aa65514ad27d5f793ad696eadde742097cd73b0283f886fe3f3a34bc3d1321d43d06bd4782b8b5f804d15e6c642932eb89f91161fd57a90bd34b4e680d687f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-indexed-profunctors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
