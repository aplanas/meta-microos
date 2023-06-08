SUMMARY = "Haskell SafeSemaphore library documentation"
DESCRIPTION = "This package provides the Haskell SafeSemaphore library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-doc-0.10.1-5.3.noarch.rpm"
RPM_HASH = "b947aa47638dc8b4526293d349f6eaec2ab20a31cf59c39c76fe1adb38e2ab9b8150be02dcddbfbfb10acf0ba9390dbd5c66a4d095e12fc56f45b6328691f6df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-SafeSemaphore-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
