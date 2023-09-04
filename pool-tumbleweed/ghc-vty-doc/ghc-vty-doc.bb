SUMMARY = "Haskell vty library documentation"
DESCRIPTION = "This package provides the Haskell vty library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.38"

RPM_NAME = "ghc-vty-doc-5.38-2.10.noarch.rpm"
RPM_HASH = "9b17926333f48440802edceda0adc553dc28135301b51a73b49a45b51b08502d4126ace5aaae017014f37d0cef53da98847ebdbe10d7aac77c79953e6d71628d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
