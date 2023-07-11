SUMMARY = "Haskell cabal2spec library documentation"
DESCRIPTION = "This package provides the Haskell cabal2spec library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "ghc-cabal2spec-doc-2.7.0-1.4.noarch.rpm"
RPM_HASH = "8df7cc0da3c6c8119ba6e6fff532db3225b751e68f4bf5fc67c95cbbe8a8aa2e39117a2ab0fbf36c4919d911d5cfcdeadd91972de5be8d14a0e5ffcbfe41207e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal2spec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
