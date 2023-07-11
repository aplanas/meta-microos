SUMMARY = "Haskell base library documentation"
DESCRIPTION = "This package provides the Haskell base library documentation."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-doc-4.17.1.0-3.2.noarch.rpm"
RPM_HASH = "9727ea17a1b73bbf9013c0025843f877994d167b8d4e1f5202a5fee130f2fb9c4d0f411fa070f5b34a55fc7e36ca31508fb2ebedb9a9d854ef1b031345d81020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
