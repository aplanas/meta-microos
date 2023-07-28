SUMMARY = "Haskell base64-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell base64-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-doc-1.2.1.0-3.1.noarch.rpm"
RPM_HASH = "f3666b40feecf693601166407b3fa0f8868035144fa8bbbc68834a6766e6744dfc2b0cbefaa5c4203de497edc849e4bc2a6fe9cdfac668a34980a3b7e8be4cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base64-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
