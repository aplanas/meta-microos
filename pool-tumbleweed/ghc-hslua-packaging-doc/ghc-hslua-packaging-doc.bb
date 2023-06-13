SUMMARY = "Haskell hslua-packaging library documentation"
DESCRIPTION = "This package provides the Haskell hslua-packaging library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-packaging-doc-2.3.0-1.3.noarch.rpm"
RPM_HASH = "eac5a7c1126f268b9db3881fedaf6a4863a710ee66ac71da39ef3872f334dc983b7e03f53a323a929e220baa728e7810fd131b4de9e0a9547bae5afd974e0d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-packaging-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
