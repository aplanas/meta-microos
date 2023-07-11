SUMMARY = "Haskell wai library documentation"
DESCRIPTION = "This package provides the Haskell wai library documentation."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "ghc-wai-doc-3.2.3-2.3.noarch.rpm"
RPM_HASH = "f641a9e91b9cd682ee4f38b4ffd28978a419e1402f38888decb0302f2148f4ae58c8c5d4c3cf692c125900721b5f2e394662b3800ad10144e973941169b2f8f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
