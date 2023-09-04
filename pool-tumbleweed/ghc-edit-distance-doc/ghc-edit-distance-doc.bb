SUMMARY = "Haskell edit-distance library documentation"
DESCRIPTION = "This package provides the Haskell edit-distance library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-doc-0.2.2.1-13.8.noarch.rpm"
RPM_HASH = "ed5040f03b5ed1c1853cd7672da3358be316080bc7b5a136baf78bf4940a8b58a2de737fa01f6b996a24e47229682ca2f91affba536538ffdf98c1ba3857bf5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-edit-distance-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
