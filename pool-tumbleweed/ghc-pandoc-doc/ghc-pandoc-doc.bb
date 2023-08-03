SUMMARY = "Haskell pandoc library documentation"
DESCRIPTION = "This package provides the Haskell pandoc library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "ghc-pandoc-doc-3.1.3-2.2.noarch.rpm"
RPM_HASH = "68a0800d77890c42d08497705e9730cb35869b5b87aaddbaea2684de42be33f88b338b63bc5eb2fcad291be163074258602c6367c67364af7c3494ef2704bf9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
