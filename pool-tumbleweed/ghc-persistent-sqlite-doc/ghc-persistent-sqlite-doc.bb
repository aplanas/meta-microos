SUMMARY = "Haskell persistent-sqlite library documentation"
DESCRIPTION = "This package provides the Haskell persistent-sqlite library documentation."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-doc-2.13.1.1-2.9.noarch.rpm"
RPM_HASH = "840601f0493dc6ecad383e11dda03622eae7884ea5924ee205b7ec033faef34ab048ac1e5114c21cb816f8eff6b744234631c4d4e816d063f403efc172d71203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-sqlite-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
