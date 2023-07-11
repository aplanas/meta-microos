SUMMARY = "Haskell hslua-packaging library documentation"
DESCRIPTION = "This package provides the Haskell hslua-packaging library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-packaging-doc-2.3.0-1.6.noarch.rpm"
RPM_HASH = "71c8c8ab1a2d1f6cd49bc586ca6d3052b8ea2100ed3aad50303078b708d9e771fb36812233a9f1545e1291ece5fc8fdf17d05696b016749eaa9c19317df949ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-packaging-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
