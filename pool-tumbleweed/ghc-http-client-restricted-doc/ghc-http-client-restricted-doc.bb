SUMMARY = "Haskell http-client-restricted library documentation"
DESCRIPTION = "This package provides the Haskell http-client-restricted library documentation."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ghc-http-client-restricted-doc-0.0.5-2.3.noarch.rpm"
RPM_HASH = "f78ca3cdca20b9e84d119a1624e24e7c96e18f291a9b94ae0b10bc5d624974358c61488a2c0f7d43734ac97c3f1976bda6fde800bc368180036f9c76a4636a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-restricted-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
