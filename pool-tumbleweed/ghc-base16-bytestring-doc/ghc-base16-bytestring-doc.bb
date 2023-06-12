SUMMARY = "Haskell base16-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell base16-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-doc-1.0.2.0-2.2.noarch.rpm"
RPM_HASH = "3e76f54687890fea2dc851088908704a501cd23c526938661ef80db9e42fa6af3e334aae6c694bee81b5ac6acaef2560491f1895315d6072fe2388a3125f3372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base16-bytestring-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
