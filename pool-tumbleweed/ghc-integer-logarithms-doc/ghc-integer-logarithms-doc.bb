SUMMARY = "Haskell integer-logarithms library documentation"
DESCRIPTION = "This package provides the Haskell integer-logarithms library documentation."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-doc-1.0.3.1-6.3.noarch.rpm"
RPM_HASH = "58e4634d386ed732022010c7d346212fa268005a23a8770f5937ed4199419dbdb4e3a21040c7b9c461c54489885380f8cd7d928ee21657416b9e805cc7204c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-integer-logarithms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
