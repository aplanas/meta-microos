SUMMARY = "Haskell strict library documentation"
DESCRIPTION = "This package provides the Haskell strict library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-strict-doc-0.5-1.7.noarch.rpm"
RPM_HASH = "3266ec0f80cde2b6ec88f60bb15bed0a6e315712ce55a1f4905d311a75b0ced3b6db3471bfea918df197353c1ab3d4b79ad846bf9525cee8f0a6d021402ebc1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-strict-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
