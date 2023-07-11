SUMMARY = "Haskell lpeg library documentation"
DESCRIPTION = "This package provides the Haskell lpeg library documentation."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-doc-1.0.4-1.4.noarch.rpm"
RPM_HASH = "1896c710a5eb6f380192bad312f3b5f09f8984d3c9373d0dd4b5a908bf6e301b3e46a75943e21718d22517a75a0c853ef833c62ad70cbb47e6ceeef0b6171659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lpeg-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
