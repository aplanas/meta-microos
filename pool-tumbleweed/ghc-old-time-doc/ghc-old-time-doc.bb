SUMMARY = "Haskell old-time library documentation"
DESCRIPTION = "This package provides the Haskell old-time library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-doc-1.1.0.3-13.4.noarch.rpm"
RPM_HASH = "928a4377eef77f1cec9eee39a19b7c7ec87e7b160082f6a33561821a696de4ecf74e910e8c0d8efa17c4fe35687d65dcc59edd6dba5117c7a946eb319e7fcbc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-old-time-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
