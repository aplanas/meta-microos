SUMMARY = "Haskell servant-server library documentation"
DESCRIPTION = "This package provides the Haskell servant-server library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-doc-0.19.2-2.13.noarch.rpm"
RPM_HASH = "2d9b6ecb10bd8ab00c1535dc28fae9f84e34d7b4873ed888b33eebd9c3daea42a5ddcc21429b3fc6df605047a1ef823fa5ef079ef2ea5400b429e31a743e9486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
