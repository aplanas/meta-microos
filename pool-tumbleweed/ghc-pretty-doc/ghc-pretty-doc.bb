SUMMARY = "Haskell pretty library documentation"
DESCRIPTION = "This package provides the Haskell pretty library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-doc-1.1.3.6-3.2.noarch.rpm"
RPM_HASH = "2430e3f4acc3669e3061b992bffbeb78183f2c3d50b4de80720ed7fbd145ab0fe98660f4ec6bc17f46d8cebdf7e0a6eadd5b92fde16cb249b7c067a0c04cd174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
