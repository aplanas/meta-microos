SUMMARY = "Haskell semigroupoids library documentation"
DESCRIPTION = "This package provides the Haskell semigroupoids library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.3.7"

RPM_NAME = "ghc-semigroupoids-doc-5.3.7-2.6.noarch.rpm"
RPM_HASH = "8aede40473b03fb215055334e53cd6e9b156be847247ca91919a697cb88599d8296b22c8f0d0d86efb00a76cc5ce5d844c0c57e5f5df83f7f51ad3ed07a68464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semigroupoids-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
