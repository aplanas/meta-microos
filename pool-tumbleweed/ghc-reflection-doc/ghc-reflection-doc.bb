SUMMARY = "Haskell reflection library documentation"
DESCRIPTION = "This package provides the Haskell reflection library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-reflection-doc-2.1.7-1.2.noarch.rpm"
RPM_HASH = "5073611d7c9f24e9d6a97f1b8e922d06bf2fc48d786e9abb364221682f3119857c934273b7f5475f399c45cd6023f4a4e340bf99c83a084bd350ddbc2dc3460a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-reflection-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
