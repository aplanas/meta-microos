SUMMARY = "Haskell kan-extensions library documentation"
DESCRIPTION = "This package provides the Haskell kan-extensions library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.2.5"

RPM_NAME = "ghc-kan-extensions-doc-5.2.5-2.6.noarch.rpm"
RPM_HASH = "160e4ac4747a5464d5f9b26052b96d0c24342ceda1bad500d2a4a98adbe2951beb9aeed7cd54a82233784e0d72094b0fbd4006486b5dda46edcf61893c8893cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-kan-extensions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
