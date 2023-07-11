SUMMARY = "Haskell wizards library documentation"
DESCRIPTION = "This package provides the Haskell wizards library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-doc-1.0.3-6.3.noarch.rpm"
RPM_HASH = "ae343ca5446de1ba3d82098541ce9d70f481415937247406cd1473bb13827fd31143c853d76e25b730334a4945e199f9c00701db990454de4374be5ee98e8bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wizards-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
