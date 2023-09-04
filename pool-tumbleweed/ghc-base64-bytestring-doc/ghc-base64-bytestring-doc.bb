SUMMARY = "Haskell base64-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell base64-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-doc-1.2.1.0-3.3.noarch.rpm"
RPM_HASH = "d7ec7646a73d8d60a74d4befb5b0a82d18cc5d16af8ef2396887abd3f25e32d81319443d8181d980818fef47b8d3a61cac0bcd8f2606d0c9a41e4c73aa57f55a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base64-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
