SUMMARY = "Haskell data-default-instances-dlist library development files"
DESCRIPTION = "This package provides the Haskell data-default-instances-dlist library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-dlist-devel-0.0.1-11.3.aarch64.rpm"
RPM_HASH = "dc7373c38fddb394d6913474debda068784935e3e0b56334793d1bb32733f3d6acbb400cb0fdb5ae6b7db233efb83613dc87a473940b5dfee11face88317d3fc"

RPROVIDES:${PN} += "ghc-data-default-instances-dlist-devel \
ghc-devel-data-default-instances-dlist-0.0.1-GnwVNQzjXMiJZgAdRGSnEk"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-default-instances-dlist \
ghc-devel-base-4.17.2.0 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-dlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ"

inherit rpm
