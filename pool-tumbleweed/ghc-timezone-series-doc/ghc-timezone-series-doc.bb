SUMMARY = "Haskell timezone-series library documentation"
DESCRIPTION = "This package provides the Haskell timezone-series library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-doc-0.1.13-2.2.noarch.rpm"
RPM_HASH = "43a513af2a70ccc5312189e724605ac6164b101c83c2ecc6ce8eeddf538f2f98532f4c72dc4f2f98105b8e9f13d26426d532f2fd1e8828139c8e52f4ca9951e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timezone-series-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
