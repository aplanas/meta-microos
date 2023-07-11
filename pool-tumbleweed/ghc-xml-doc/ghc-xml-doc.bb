SUMMARY = "Haskell xml library documentation"
DESCRIPTION = "This package provides the Haskell xml library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-doc-1.3.14-13.6.noarch.rpm"
RPM_HASH = "397035113681a42f625f1f3ca3803e20ab634bb3951a1a6c11644299be4d544aed96be55d11c61a9b3fe7bf8b817f1ecb2d1f1aa830f0f2c2f48d295ff939d08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
