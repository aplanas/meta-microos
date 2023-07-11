SUMMARY = "Haskell hslua-aeson library documentation"
DESCRIPTION = "This package provides the Haskell hslua-aeson library documentation."
LICENSE = "MIT"

PV = "2.3.0.1"

RPM_NAME = "ghc-hslua-aeson-doc-2.3.0.1-1.3.noarch.rpm"
RPM_HASH = "a3bc726aa9af3da61d492b713a812dd4531a572ac40d5060d1633546a1b441979724703e1b01a3ab914541b8198d2ebcf46dfb9ffdd3f91ed6d07f93982b622d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-aeson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
