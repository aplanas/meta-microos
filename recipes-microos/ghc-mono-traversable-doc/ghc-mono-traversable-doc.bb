SUMMARY = "Haskell mono-traversable library documentation"
DESCRIPTION = "This package provides the Haskell mono-traversable library documentation."
LICENSE = "MIT"

PV = "1.0.15.3"

RPM_NAME = "ghc-mono-traversable-doc-1.0.15.3-2.3.noarch.rpm"
RPM_HASH = "185572eb061e49f60836dbad5b5007d33d7568b08347b64536467a85d13f0bff1b8953b0f4d221832ec89cc5a226eae1d7359987846826377b6718defb755039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mono-traversable-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
