SUMMARY = "Haskell lens library documentation"
DESCRIPTION = "This package provides the Haskell lens library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.2.2"

RPM_NAME = "ghc-lens-doc-5.2.2-2.4.noarch.rpm"
RPM_HASH = "d08445478dadf9ae470eb589a3bbc8551b775e8c08b3895ca0cbe5fd5da65324b9f813282373b41ae51c7bc12a4644c9324c0002099343f8745fe77977a13d99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lens-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
