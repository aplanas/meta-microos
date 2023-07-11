SUMMARY = "Haskell wai-extra library documentation"
DESCRIPTION = "This package provides the Haskell wai-extra library documentation."
LICENSE = "MIT"

PV = "3.1.13.0"

RPM_NAME = "ghc-wai-extra-doc-3.1.13.0-2.7.noarch.rpm"
RPM_HASH = "ad8634971e2e8b7aa2a98e0782814a4d3822770f848192f7ef9f8516bce130e1f44fb7cbb5308dc52d6eb2493a6d57ca9900155b2071c9feb59ba6e26ddd326f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
