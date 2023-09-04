SUMMARY = "Haskell hslua-module-system library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-system library documentation."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-system-doc-1.1.0.1-1.3.noarch.rpm"
RPM_HASH = "4d05c09030e53c62bd6e52ca962cf7dd34f48a31e1e7df6d7a36c64fccd3b5885dd18b86cd931844a8ef5286083397214fbd8217927ad7b792bb541e06b65129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-system-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
