SUMMARY = "Haskell persistent-sqlite library documentation"
DESCRIPTION = "This package provides the Haskell persistent-sqlite library documentation."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-doc-2.13.1.1-2.15.noarch.rpm"
RPM_HASH = "bb463827fc1221b1f6c1c98b99c69b457f6569daaadc08f1b46b936aa26320e9dc02bf3763e4f2a6878bf0858748ce49994bb45e55bb2a60d3fb5f5218c79bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-sqlite-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
