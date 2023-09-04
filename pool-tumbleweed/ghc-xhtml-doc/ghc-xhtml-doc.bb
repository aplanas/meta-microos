SUMMARY = "Haskell xhtml library documentation"
DESCRIPTION = "This package provides the Haskell xhtml library documentation."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-doc-3000.2.2.1-1.1.noarch.rpm"
RPM_HASH = "067efc1ac968533ca706e76758253b3c46c51664379626470f786dc410ef7badf189a1a26bfa443a39e20c32a2627a151a42d87594031ad80a54d104310827dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xhtml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
