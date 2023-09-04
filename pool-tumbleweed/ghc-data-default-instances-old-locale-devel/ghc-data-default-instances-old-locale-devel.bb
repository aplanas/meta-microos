SUMMARY = "Haskell data-default-instances-old-locale library development files"
DESCRIPTION = "This package provides the Haskell data-default-instances-old-locale library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-old-locale-devel-0.0.1-11.3.aarch64.rpm"
RPM_HASH = "695d3819d6f1901464262395d38d4a30cdb0de39dcb948b664467d8e1fa6005f3bc655b4f9e88dff18d3eb4a00d87c06d352ae9c9e90a811499df0e9dff0cdc7"

RPROVIDES:${PN} += "ghc-data-default-instances-old-locale-devel \
ghc-devel-data-default-instances-old-locale-0.0.1-JPGD6DG1zci1Efipgkh66I"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-default-instances-old-locale \
ghc-devel-base-4.17.2.0 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk"

inherit rpm
