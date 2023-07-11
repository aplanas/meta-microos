SUMMARY = "Haskell ordered-containers library documentation"
DESCRIPTION = "This package provides the Haskell ordered-containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-ordered-containers-doc-0.2.3-1.3.noarch.rpm"
RPM_HASH = "79a591c54b2f04e400a4287be7dd3199c75dbe7508349ed3fbd3def5e5b865f0b690714d43ebb611327d222f8ccd6c1366ea1c3ab13989cd8eb26bd233cb3ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ordered-containers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
