SUMMARY = "Haskell wai-cors library documentation"
DESCRIPTION = "This package provides the Haskell wai-cors library documentation."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-doc-0.2.7-1.5.noarch.rpm"
RPM_HASH = "6341fa27da13cd6da987dd21f35b0fdd47c9c809c24a5a31c62b1337090ca311eb4ae32e6127dcf1fd8134a77291aed49d17df5bcbf0afa6051ce9bb11586bd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-cors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
