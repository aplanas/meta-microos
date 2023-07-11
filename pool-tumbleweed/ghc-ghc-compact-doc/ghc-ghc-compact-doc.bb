SUMMARY = "Haskell ghc-compact library documentation"
DESCRIPTION = "This package provides the Haskell ghc-compact library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-doc-0.1.0.0-3.2.noarch.rpm"
RPM_HASH = "6ae8ae9bf55def70938a8e28dd8ddd5a76ac92b247d1ff3b1ad8ab66ff1a598f15a429ae00b72544ae209a138c406999c9ff68cafee2fa24e38705bb80552542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-compact-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
