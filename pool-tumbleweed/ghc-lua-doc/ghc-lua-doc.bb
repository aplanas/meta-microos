SUMMARY = "Haskell lua library documentation"
DESCRIPTION = "This package provides the Haskell lua library documentation."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-doc-2.3.1-1.3.noarch.rpm"
RPM_HASH = "08ab191400e830729531730c85d2cb529861cd7cefeb19a392b8a7865c52c211700de5717d60eea3422f0778061d7c0f80b55700495a2322c9caea0b3a824aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lua-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
