SUMMARY = "Haskell fgl library documentation"
DESCRIPTION = "This package provides the Haskell fgl library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-doc-5.8.0.0-3.4.noarch.rpm"
RPM_HASH = "06061f7342815f2d19ec288f23c8f4fe0816ee8b22c9ef31a2f5d1dd786eb667a5525b57f82ceb8d7415a0ee53e17f04adebf2d0697e7454af3971634b5abb11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fgl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
