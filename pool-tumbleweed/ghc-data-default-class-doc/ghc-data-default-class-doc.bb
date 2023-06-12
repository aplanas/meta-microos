SUMMARY = "Haskell data-default-class library documentation"
DESCRIPTION = "This package provides the Haskell data-default-class library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-data-default-class-doc-0.1.2.0-10.2.noarch.rpm"
RPM_HASH = "d967096c63bc6c039f233bcd52e9ecf75009be025c8a5c25cc0dd54e2e744c1bdc69b6e4357aaa6b8d63243c2fa071388e47ef9425c808ab9bec6b9bde402bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-class-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
