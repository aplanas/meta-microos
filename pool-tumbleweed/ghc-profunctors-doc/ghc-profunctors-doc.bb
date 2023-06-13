SUMMARY = "Haskell profunctors library documentation"
DESCRIPTION = "This package provides the Haskell profunctors library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.6.2"

RPM_NAME = "ghc-profunctors-doc-5.6.2-4.3.noarch.rpm"
RPM_HASH = "f5952d397c44dc3e1f7f248d68b4c2b1784c6d6c3df814601945303e36f6ea65e09317a6d33ee8e5abf6dd5598319e7075fe42f17b07a5a3030f904d33892d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-profunctors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
