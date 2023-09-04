SUMMARY = "Haskell data-default-instances-old-locale profiling library"
DESCRIPTION = "This package provides the Haskell data-default-instances-old-locale profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-old-locale-prof-0.0.1-11.3.aarch64.rpm"
RPM_HASH = "4efed629772d38827253aab2b05f6fb9acac3055029dccc6b4d2ebee8f72eae162a2e535e6a066b76c7895a98b273b2b9a4c522bc150ff831fe88e0c7637d3ab"

RPROVIDES:${PN} += "ghc-data-default-instances-old-locale-prof \
ghc-prof-data-default-instances-old-locale-0.0.1-JPGD6DG1zci1Efipgkh66I"

RDEPENDS:${PN} += "ghc-data-default-instances-old-locale-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk"

inherit rpm
