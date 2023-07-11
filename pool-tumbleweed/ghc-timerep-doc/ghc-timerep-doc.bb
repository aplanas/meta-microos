SUMMARY = "Haskell timerep library documentation"
DESCRIPTION = "This package provides the Haskell timerep library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-doc-2.1.0.0-1.8.noarch.rpm"
RPM_HASH = "c86d7b7c50b2e386bca45433b841aba7e29a0ddc4b43503470bd3c39abeb12cd25339e6812ec6b777fc63982efbae4c6e3684d71613bd8e5f65ac4054c740813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timerep-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
