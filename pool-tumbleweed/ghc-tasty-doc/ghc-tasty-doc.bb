SUMMARY = "Haskell tasty library documentation"
DESCRIPTION = "This package provides the Haskell tasty library documentation."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "ghc-tasty-doc-1.4.3-1.3.noarch.rpm"
RPM_HASH = "2e480625b16cbefafec849dbd1d7d8eed25ecb78efc41fbd91563c7f9d6d4692b6f566dcd311bc43689e3ef548eda05574b0da389354a4cbf5aaae90e9857ffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
