SUMMARY = "Haskell th-abstraction library documentation"
DESCRIPTION = "This package provides the Haskell th-abstraction library documentation."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-doc-0.4.5.0-2.6.noarch.rpm"
RPM_HASH = "824c16fcc36328a695478dcbf8d588797480d2db8cf843123dc16823b1b97a10b3ce33ce74224d560724461e6cb007e54e48fdfdc0463151ca8d3493cbe308b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-abstraction-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
