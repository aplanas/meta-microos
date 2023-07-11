SUMMARY = "Haskell blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-doc-0.9.1.2-8.6.noarch.rpm"
RPM_HASH = "383d7040e077d5cd726396a678da43fe81c1d8d21db3d348117536d7096a73021deae4fb644726b2a41967c293b9e350980ad975a8c715c14ddfff8e23b3db60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
