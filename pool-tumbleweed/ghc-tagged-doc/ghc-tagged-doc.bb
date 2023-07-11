SUMMARY = "Haskell tagged library documentation"
DESCRIPTION = "This package provides the Haskell tagged library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.7"

RPM_NAME = "ghc-tagged-doc-0.8.7-1.6.noarch.rpm"
RPM_HASH = "011d50ee46ed528fbabd1334fa7526ea74bbe7baad01c8b08f18afefb7086a91340233645bac890c6d9ebc187c85505551871fe4581567204a486267f0a5ba09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tagged-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
