SUMMARY = "Haskell network-info library development files"
DESCRIPTION = "This package provides the Haskell network-info library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-devel-0.2.1-2.3.aarch64.rpm"
RPM_HASH = "aae26026080a75809919307c65acbb528367effbb70753111666dd96b53874a2f20264d65e4fa89f1709da870e07e7ee03d08d7e83fd04148ec99877eeb9ad0e"

RPROVIDES:${PN} += "ghc-devel-network-info-0.2.1-G9nMDkAKQecAEHIupCmq9I \
ghc-network-info-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-network-info"

inherit rpm
