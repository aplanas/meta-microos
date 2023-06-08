SUMMARY = "Haskell digest library documentation"
DESCRIPTION = "This package provides the Haskell digest library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-doc-0.0.1.7-1.3.noarch.rpm"
RPM_HASH = "22f2a754f6b7bbcc2e53f4a582a2068733192592609de3e13ee582f3f27eae38beaeffe46395f8ab73f2c919f533b83691372c9e71d0cc9d46acd5f6bc6f2bcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-digest-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
