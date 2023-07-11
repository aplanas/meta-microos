SUMMARY = "Haskell streaming-commons library documentation"
DESCRIPTION = "This package provides the Haskell streaming-commons library documentation."
LICENSE = "MIT"

PV = "0.2.2.6"

RPM_NAME = "ghc-streaming-commons-doc-0.2.2.6-1.7.noarch.rpm"
RPM_HASH = "031285444ca8b503c7bc259044168b36dbe400fd606cb70489ade62c4f1f79390a1010ebc841c8fa9a24b344db888141d45827366c0fab6a4c23a14df964cd5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-streaming-commons-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
