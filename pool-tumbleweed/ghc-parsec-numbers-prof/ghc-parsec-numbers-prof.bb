SUMMARY = "Haskell parsec-numbers profiling library"
DESCRIPTION = "This package provides the Haskell parsec-numbers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-parsec-numbers-prof-0.1.0-7.3.aarch64.rpm"
RPM_HASH = "c340201597f4976f50ca4dab2bed2e695c43402c018249279458cc0ff456ad247a81ca46f863240553fb121b5fb9bd0e8e6c1006735609102b428b8a73b759ca"

RPROVIDES:${PN} += "ghc-parsec-numbers-prof \
ghc-prof-parsec-numbers-0.1.0-JmfSOl7TbABbRzQTrD74l"

RDEPENDS:${PN} += "ghc-parsec-numbers-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-parsec-3.1.16.1"

inherit rpm
