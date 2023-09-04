SUMMARY = "Haskell language-c library documentation"
DESCRIPTION = "This package provides the Haskell language-c library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-doc-0.9.2-2.8.noarch.rpm"
RPM_HASH = "5e2ad2e26d9a1766f3e03de0adef2e6175c3406d448e27261d5cd5c41b5a0446fece95483cda90a5144a721ed434022598dd365fcb2f4242dc1e38166ea9c984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-c-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
