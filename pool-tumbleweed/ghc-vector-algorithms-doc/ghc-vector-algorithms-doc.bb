SUMMARY = "Haskell vector-algorithms library documentation"
DESCRIPTION = "This package provides the Haskell vector-algorithms library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.0.1"

RPM_NAME = "ghc-vector-algorithms-doc-0.9.0.1-1.3.noarch.rpm"
RPM_HASH = "8a83aa5f67f159e8d5ad3ded351fdf881a8b4827bac57dd829bd685ece31825e25bb8559f16f4cf6ff075d63f43a55e4eab84f5b6eb3346059d72d6d46ebbe44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-algorithms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
