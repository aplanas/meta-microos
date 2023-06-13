SUMMARY = "Haskell concurrent-output library documentation"
DESCRIPTION = "This package provides the Haskell concurrent-output library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.10.17"

RPM_NAME = "ghc-concurrent-output-doc-1.10.17-2.3.noarch.rpm"
RPM_HASH = "7dc36af8ea1488ed36a6284ff24ad830e78b0bb2470fb5e2a85e497da179cf22280ff64792d30262dce605c0a75ac7192b19023021619e2a7a03c94df495db3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-concurrent-output-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
