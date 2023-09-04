SUMMARY = "Haskell clientsession library documentation"
DESCRIPTION = "This package provides the Haskell clientsession library documentation."
LICENSE = "MIT"

PV = "0.9.2.0"

RPM_NAME = "ghc-clientsession-doc-0.9.2.0-2.4.noarch.rpm"
RPM_HASH = "11f48cf1ecf4c137897403037b87330de5663ede1aa792c3efe14018e7ed85550b46414bafc0834dd9fdc67c4d4246a1e8482c8c894d439c8abad97e452478ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-clientsession-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
