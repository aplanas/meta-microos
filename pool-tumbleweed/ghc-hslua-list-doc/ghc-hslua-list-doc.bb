SUMMARY = "Haskell hslua-list library documentation"
DESCRIPTION = "This package provides the Haskell hslua-list library documentation."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-hslua-list-doc-1.1.1-2.5.noarch.rpm"
RPM_HASH = "1294f6a5eddc0242606e442bf089de2badb4a3d016cfa02cc2148a4191263ca4f371abd1100b772de799684ee9f58490059ae0f045ac85c7d661b6149f02a904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-list-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
