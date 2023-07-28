SUMMARY = "Haskell commonmark-extensions library documentation"
DESCRIPTION = "This package provides the Haskell commonmark-extensions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-commonmark-extensions-doc-0.2.3.5-1.1.noarch.rpm"
RPM_HASH = "d807f89d1b5bb867a3e6d55b440ffaa2b2cf323592e05fde8f97f7950cd3990bf42a8f8e5eb9525962f1e3791e8c90ff631918c1c4f2339ef15f51c4e6da4182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-extensions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
