SUMMARY = "Haskell pandoc library documentation"
DESCRIPTION = "This package provides the Haskell pandoc library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "ghc-pandoc-doc-3.1.3-2.10.noarch.rpm"
RPM_HASH = "0ca73ad61dadd82d385cc1e75767c966f99c6ac9b80c8c8cf0edb91a98a61d1fce2f2253dbbbaa722268f88c7cf4f2b6d57e06e12a4d7a4f3a2a50f0d5179f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
