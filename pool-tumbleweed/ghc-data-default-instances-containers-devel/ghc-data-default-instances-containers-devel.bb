SUMMARY = "Haskell data-default-instances-containers library development files"
DESCRIPTION = "This package provides the Haskell data-default-instances-containers library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-containers-devel-0.0.1-11.3.aarch64.rpm"
RPM_HASH = "5d70112de751b5828b5e42078ff66bd18552c66585a4d6b7bcaa9072aa85480c413272530982894fed8bd1e2e6d88fbe2db703cc318c9d86548c06c7a21b4d8a"

RPROVIDES:${PN} += "ghc-data-default-instances-containers-devel \
ghc-devel-data-default-instances-containers-0.0.1-HEdLgVFxVe7RkY046PWd1"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-default-instances-containers \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN"

inherit rpm
