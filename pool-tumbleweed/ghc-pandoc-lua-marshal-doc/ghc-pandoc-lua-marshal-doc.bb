SUMMARY = "Haskell pandoc-lua-marshal library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal library documentation."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ghc-pandoc-lua-marshal-doc-0.2.2-1.12.noarch.rpm"
RPM_HASH = "cbcd068e9dc6777d8fabb4fe2ac1024273b56c14fe059d33c11212de775215abc26d18d2eed1738422148522a1df61e32b2cf86ad7736a06d67ecc0847d4cec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-marshal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
