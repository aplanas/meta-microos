SUMMARY = "Haskell utility-ht profiling library"
DESCRIPTION = "This package provides the Haskell utility-ht profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.17"

RPM_NAME = "ghc-utility-ht-prof-0.0.17-1.5.aarch64.rpm"
RPM_HASH = "7186e8599673f89d65d89b585c0ddaef57e2af1550780e6db83a4fa47cc935cc15ad8c6efe077d0399c3c1dba9c72c90128c27a1268176c7848a6454b6c97e11"

RPROVIDES:${PN} += "ghc-prof-utility-ht-0.0.17-7cPYZhnhJbDGSMxoZBrT62 \
ghc-utility-ht-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-utility-ht-devel"

inherit rpm
