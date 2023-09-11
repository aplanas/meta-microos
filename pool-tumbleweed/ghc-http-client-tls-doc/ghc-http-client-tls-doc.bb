SUMMARY = "Haskell http-client-tls library documentation"
DESCRIPTION = "This package provides the Haskell http-client-tls library documentation."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-doc-0.3.6.1-2.8.noarch.rpm"
RPM_HASH = "540b540c2a59d252478bf82f5f5e567ddcf29972ce604f437ebc40277dd60fa5e3cfad9f5c857a8ddc420f593727c43c6b6af26ded6c6059bc085d1e9c8a4c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
