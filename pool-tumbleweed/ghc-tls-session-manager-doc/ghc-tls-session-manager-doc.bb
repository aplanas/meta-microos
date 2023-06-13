SUMMARY = "Haskell tls-session-manager library documentation"
DESCRIPTION = "This package provides the Haskell tls-session-manager library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-doc-0.0.4-4.2.noarch.rpm"
RPM_HASH = "34c84afbc7de7451c1c7c8c08bd86f9813899354f694e7ba21b768105e933a464640ff2f6ddb4af452f1d12d82140eae8441c007014f1991cf2b2ce9f015e0c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tls-session-manager-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
