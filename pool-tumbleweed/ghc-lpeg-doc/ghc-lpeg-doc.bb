SUMMARY = "Haskell lpeg library documentation"
DESCRIPTION = "This package provides the Haskell lpeg library documentation."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-doc-1.0.4-1.5.noarch.rpm"
RPM_HASH = "d3d0295f5aca4d450d908338ae29f67a9cc2562a05849590e71f688501bd534992541dcad8a63fec91d0424598e5c13111d15595948203f914b547f56723c14c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lpeg-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
