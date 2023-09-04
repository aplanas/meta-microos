SUMMARY = "Haskell xhtml profiling library"
DESCRIPTION = "This package provides the Haskell xhtml profiling library."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-prof-3000.2.2.1-1.1.aarch64.rpm"
RPM_HASH = "93025ed5b30664603179a4374cbfc5b516c62702ebb007d16e1f5de1f2985dea001d4f1de55b95725827b0b99f1088e2afc50afc59fe34c35611e800f289ff8d"

RPROVIDES:${PN} += "ghc-prof-xhtml-3000.2.2.1 \
ghc-xhtml-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-xhtml-devel"

inherit rpm
