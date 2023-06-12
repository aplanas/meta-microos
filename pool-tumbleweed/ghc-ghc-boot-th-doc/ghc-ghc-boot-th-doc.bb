SUMMARY = "Haskell ghc-boot-th library documentation"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-doc-9.4.5-3.1.noarch.rpm"
RPM_HASH = "c67f1b8bf133c22d45cc2f18e8cc135e52a656774eb2e5e2e2bf6e889cb7111699a8d770ca4019d94d8a037ce830fec073ebcdaedc8e303788898ab71bf9782b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-boot-th-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
