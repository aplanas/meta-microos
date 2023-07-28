SUMMARY = "Haskell servant library documentation"
DESCRIPTION = "This package provides the Haskell servant library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "ghc-servant-doc-0.19.1-3.1.noarch.rpm"
RPM_HASH = "8b8b4473b48194ea599cfd885d106e91500442dcb5c154ae8e16dc2a022c2df6ead86f8f7e17a13bb7a75c4884438e19d874c4421d14c3baff8ba57188b51494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
