SUMMARY = "Haskell wai library documentation"
DESCRIPTION = "This package provides the Haskell wai library documentation."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "ghc-wai-doc-3.2.3-2.5.noarch.rpm"
RPM_HASH = "9e096bf7057ebe1f53b894c5f835fe5ace5f6d439357fa72f347883c0e0d8d30fb91432a1b60268d6811361cea95d6db4db4b4583e9dc5aba4b03443f0ad627a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
