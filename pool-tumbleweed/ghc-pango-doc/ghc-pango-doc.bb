SUMMARY = "Haskell pango library documentation"
DESCRIPTION = "This package provides the Haskell pango library documentation."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-pango-doc-0.13.10.0-1.3.noarch.rpm"
RPM_HASH = "a0b8eb33f22101c3858a9db0223b78aa40b90d18a66f79fe574a1a6269019e4baa0efe510fcba4cc1ed091e63ef44a65b42d6b3052515e92add62273f7c2f5d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pango-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
