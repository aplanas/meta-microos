SUMMARY = "Haskell primitive library documentation"
DESCRIPTION = "This package provides the Haskell primitive library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.0"

RPM_NAME = "ghc-primitive-doc-0.7.4.0-1.3.noarch.rpm"
RPM_HASH = "6b4f16ca64006e4c4db2a18e704acb989392b69f3bbe0952de04310be9b12a0e717def63758c39792c88858d5aea8cdbca609c36f7755933d1e8b370350e6b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-primitive-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
