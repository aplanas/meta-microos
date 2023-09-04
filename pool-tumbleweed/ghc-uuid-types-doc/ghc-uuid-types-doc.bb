SUMMARY = "Haskell uuid-types library documentation"
DESCRIPTION = "This package provides the Haskell uuid-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-uuid-types-doc-1.0.5-5.4.noarch.rpm"
RPM_HASH = "f4cc79f239e0b7fabe4760fe9001382e6dfbbc65b134a37710755f99a5be6013889fa7640a99d54ac950bff0891cf6cb3cc58fe3ecc4d37198acf2aa06befb70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uuid-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
