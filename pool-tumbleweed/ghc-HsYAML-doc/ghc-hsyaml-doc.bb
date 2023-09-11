SUMMARY = "Haskell HsYAML library documentation"
DESCRIPTION = "This package provides the Haskell HsYAML library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-doc-0.2.1.1-6.1.noarch.rpm"
RPM_HASH = "5166a66b8b4e1f695c50be190ebc81ea1142a4e4f46f5e8f858658af5fc58580a48edc46ee2962dd2552e9830153d9165c24124211eb7b25830ac580196d6ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HsYAML-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
