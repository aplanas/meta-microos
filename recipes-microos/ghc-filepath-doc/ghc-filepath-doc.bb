SUMMARY = "Haskell filepath library documentation"
DESCRIPTION = "This package provides the Haskell filepath library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-doc-1.4.2.2-3.1.noarch.rpm"
RPM_HASH = "c4ae06ef451ab96e796bf7e9795b7513534b36ee60201981b763c3e31413284655b2526a20888af9442bb095655058a664e2456b9d74d19ea098d310d6bd64d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepath-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
