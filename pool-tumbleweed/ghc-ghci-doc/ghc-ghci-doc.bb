SUMMARY = "Haskell ghci library documentation"
DESCRIPTION = "This package provides the Haskell ghci library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghci-doc-9.4.6-1.1.noarch.rpm"
RPM_HASH = "65143efa25df10b1f4d06b2f84c685b1891c0d768347a0be863098e4170f90c954127a03534deaaacb0da0e07342ba0d56fc7817541853338f5830aaf581cf95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghci-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
