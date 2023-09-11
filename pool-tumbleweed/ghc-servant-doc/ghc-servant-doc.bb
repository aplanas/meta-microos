SUMMARY = "Haskell servant library documentation"
DESCRIPTION = "This package provides the Haskell servant library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "ghc-servant-doc-0.19.1-3.5.noarch.rpm"
RPM_HASH = "eb430ac017fc4881b45e9a4298a2194fa2978b7074c56afe63167dcb131deff5491aa44946c8ce3646f662ee66318437002b1b47e359d8a16022257e46de5280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
