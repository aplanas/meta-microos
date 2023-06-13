SUMMARY = "Haskell monad-control library documentation"
DESCRIPTION = "This package provides the Haskell monad-control library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.3.1"

RPM_NAME = "ghc-monad-control-doc-1.0.3.1-2.2.noarch.rpm"
RPM_HASH = "bc6a9b959edfc628238a69848a87391ba130d1e9b675ded67d0998d2ea93ee35d1e0ee98cc08ae935d6f8aa30543a576884320399a23b09f84600b27e0c3bca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monad-control-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
