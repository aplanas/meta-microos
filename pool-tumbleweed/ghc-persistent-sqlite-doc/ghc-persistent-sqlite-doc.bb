SUMMARY = "Haskell persistent-sqlite library documentation"
DESCRIPTION = "This package provides the Haskell persistent-sqlite library documentation."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-doc-2.13.1.1-2.7.noarch.rpm"
RPM_HASH = "ce18a2883a33cdedb17d3dd4295f2c17a9eda414f750835dcb8227e064fd552c24a9fe6daa8515db4d0eac8b938455c0840769ecb3f546ac67292f9e7f7b11d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-sqlite-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
