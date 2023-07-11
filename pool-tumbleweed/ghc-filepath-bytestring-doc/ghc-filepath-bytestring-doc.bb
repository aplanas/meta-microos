SUMMARY = "Haskell filepath-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell filepath-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.1.13"

RPM_NAME = "ghc-filepath-bytestring-doc-1.4.2.1.13-1.3.noarch.rpm"
RPM_HASH = "e0139130cd6ecfc68783f3d3d95253c60a50b0664ad4b3862f6d543759998b51ae93367c98afd27798b304492672c86ad2ea5c6cfdd001aca8ba14873eeceb5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepath-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
