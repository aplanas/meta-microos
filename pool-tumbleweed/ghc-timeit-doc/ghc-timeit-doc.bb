SUMMARY = "Haskell timeit library documentation"
DESCRIPTION = "This package provides the Haskell timeit library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-doc-2.0-6.2.noarch.rpm"
RPM_HASH = "0afaa22329c67078a5f6db389aad2f92b65c20e512642421f89be516ceb3cf65838106171e796ce5698b1ce6f53bc4c601dfa13cd39a22d04f096c109e406fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timeit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
