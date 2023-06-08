SUMMARY = "Haskell ghc-heap library documentation"
DESCRIPTION = "This package provides the Haskell ghc-heap library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-doc-9.4.5-1.1.noarch.rpm"
RPM_HASH = "028c1157b3ee24e37db022d5cd8a61aee6d594ae2b7714ddc4fa83a1cfd444101aa2067e8d2e6c54dff7a79c743138561cf591980778ba061dfff72a83811aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-heap-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
