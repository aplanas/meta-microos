SUMMARY = "Haskell regex-tdfa library documentation"
DESCRIPTION = "This package provides the Haskell regex-tdfa library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-regex-tdfa-doc-1.3.2.1-2.1.noarch.rpm"
RPM_HASH = "e11982e33686470c89c8f727a047d76fe4f2932244caa01dbfda5d38e7c61a1479ce539b8f80e259685dc5c5fccd9381149119bc730f2774cb20cf90338e791d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-tdfa-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
