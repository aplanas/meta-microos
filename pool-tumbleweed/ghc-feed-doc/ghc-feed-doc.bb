SUMMARY = "Haskell feed library documentation"
DESCRIPTION = "This package provides the Haskell feed library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-doc-1.3.2.1-4.3.noarch.rpm"
RPM_HASH = "b060da5d4953f750f9c73bbce4db68f3e5e5282005f68b9a980207f10eff581768faee34e1b227015b0b72d89581366919650d1a4735de6e34307ecc3986103c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-feed-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
