SUMMARY = "Haskell hslua-list library documentation"
DESCRIPTION = "This package provides the Haskell hslua-list library documentation."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-hslua-list-doc-1.1.1-2.3.noarch.rpm"
RPM_HASH = "e202169ca078d9c2e2636df565c8fdfcf64801bb297db6fcceb96ceed20d72243ea09f3de4a8c1d406b518e24cce381e41276dbb9de663e15931f9365b857585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-list-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
