SUMMARY = "Haskell commutative-semigroups library documentation"
DESCRIPTION = "This package provides the Haskell commutative-semigroups library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-commutative-semigroups-doc-0.1.0.1-1.3.noarch.rpm"
RPM_HASH = "964b295f8049bea3b05641eadb5f34a426621c4f3c23d3ba8797d73803b8c42ee221500d52d73281dba2588a1dbcc69f1d918bed9c3dbb7b4cb0964ede066e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commutative-semigroups-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
