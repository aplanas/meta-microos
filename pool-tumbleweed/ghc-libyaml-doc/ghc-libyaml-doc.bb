SUMMARY = "Haskell libyaml library documentation"
DESCRIPTION = "This package provides the Haskell libyaml library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-libyaml-doc-0.1.2-6.11.noarch.rpm"
RPM_HASH = "a16640be461df8df087e004c317a6af2659cc8b61007dcf7a2da5ed9aa0a33a5c17a1e2d87a1d2afdee0da10075f63bea3ea4c072970275808e0b36fde3148fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libyaml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
