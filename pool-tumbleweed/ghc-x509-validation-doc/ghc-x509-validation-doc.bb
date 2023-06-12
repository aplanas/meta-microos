SUMMARY = "Haskell x509-validation library documentation"
DESCRIPTION = "This package provides the Haskell x509-validation library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.12"

RPM_NAME = "ghc-x509-validation-doc-1.6.12-2.3.noarch.rpm"
RPM_HASH = "0afaa9790f616b49b81afc2f4258368282cf23d9a47af3fbf5c443c4eee8251a88cd4cbe8538376d6e7976da4d37c975b03ee4d8bc7549f65c583760322340ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-validation-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
