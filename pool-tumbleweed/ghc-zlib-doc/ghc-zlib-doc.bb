SUMMARY = "Haskell zlib library documentation"
DESCRIPTION = "This package provides the Haskell zlib library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-doc-0.6.3.0-4.2.noarch.rpm"
RPM_HASH = "2621382050d0f1c8e7d43a42721460a8068db099a767e15640013d860ad5a1fc96c38f0a0941f7d7ccce595d039f965e65450112260ca18c4b37b46b1adcdb3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-zlib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
