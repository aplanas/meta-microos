SUMMARY = "Haskell time-compat library documentation"
DESCRIPTION = "This package provides the Haskell time-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.9.6.1"

RPM_NAME = "ghc-time-compat-doc-1.9.6.1-5.3.noarch.rpm"
RPM_HASH = "a42ddace190050abfe0196cad4b66b6a0d30d7bfddd21c81ba921c4f30c4d87463349557fbbd29acf94009233ee1adbd146238f4241a615e99103d2cd5dae97a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-compat-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
