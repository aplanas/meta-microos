SUMMARY = "Haskell data-default profiling library"
DESCRIPTION = "This package provides the Haskell data-default profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-data-default-prof-0.7.1.1-10.3.aarch64.rpm"
RPM_HASH = "0c790e17a80d47b80f802c2c822d2018d4f06cfb45bf1698b101cc213fa855db0232e979698a6a536fdfccded3e84d2f567aef45d3a196728b13cbea7d5f2b72"

RPROVIDES:${PN} += "ghc-data-default-prof \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc"

RDEPENDS:${PN} += "ghc-data-default-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-data-default-instances-containers-0.0.1-HEdLgVFxVe7RkY046PWd1 \
ghc-prof-data-default-instances-dlist-0.0.1-GnwVNQzjXMiJZgAdRGSnEk \
ghc-prof-data-default-instances-old-locale-0.0.1-JPGD6DG1zci1Efipgkh66I"

inherit rpm
