SUMMARY = "Haskell contravariant library documentation"
DESCRIPTION = "This package provides the Haskell contravariant library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-doc-1.5.5-2.6.noarch.rpm"
RPM_HASH = "d2e2a586218d83ad99579a0f06b23a798168c392318ab017feb65dd95523fd1e406906695bbb2df1ffefb92b474ba85caa6040bc6ca75f24d7b9e64294e95b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-contravariant-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
