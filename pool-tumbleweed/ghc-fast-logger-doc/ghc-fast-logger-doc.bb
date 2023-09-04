SUMMARY = "Haskell fast-logger library documentation"
DESCRIPTION = "This package provides the Haskell fast-logger library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-doc-3.1.2-1.12.noarch.rpm"
RPM_HASH = "45b8ec41f0521052afe4a1bed98d0400a7ce74180c4606b20a6df3f02ffbbb649118fbc917f277ee812cd1273cfc27996346518af2aed10a3303e284f0bcde8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fast-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
