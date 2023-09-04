SUMMARY = "Haskell sop-core library documentation"
DESCRIPTION = "This package provides the Haskell sop-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-doc-0.5.0.2-4.8.noarch.rpm"
RPM_HASH = "ce99152e66135357d11998b3be7829395aaad77048a9912359d7c32541166f1924f4c281cdf0a04617223b22a55877a0555da00b15d19225faf2d93fe3f3724c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-sop-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
