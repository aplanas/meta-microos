SUMMARY = "Haskell doclayout library documentation"
DESCRIPTION = "This package provides the Haskell doclayout library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-doclayout-doc-0.4.0.1-1.2.noarch.rpm"
RPM_HASH = "59afd7262d7d768a02b740d82742131278017de7c040a5ab3664a5e17e5bdcd2c7480e18c1c11ce27b624ab435825e253efdbda823baecdc37fa58a621db53de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doclayout-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
