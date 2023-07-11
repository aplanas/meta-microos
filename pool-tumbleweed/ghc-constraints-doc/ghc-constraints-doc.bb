SUMMARY = "Haskell constraints library documentation"
DESCRIPTION = "This package provides the Haskell constraints library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-constraints-doc-0.13.4-2.6.noarch.rpm"
RPM_HASH = "809f18837e9e6eb5cb4afae7670051f24e367d6f268491cdd5f9d342ff111a4f5f4d2348fe781de775f149caa39d06427a85b4bec8e44e94f824818bd1ad2cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-constraints-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
