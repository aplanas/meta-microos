SUMMARY = "Haskell ghc-lib-parser library documentation"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5.20230430"

RPM_NAME = "ghc-ghc-lib-parser-doc-9.4.5.20230430-1.3.noarch.rpm"
RPM_HASH = "0384448f6f72e2392fe31a2b0684af0e006fbd5f4dba546e085cdb6c8b972ca7c84b3608acb37166a18ff1340dc4cd1f55e17546aa3dbd2977039d002b79714f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
