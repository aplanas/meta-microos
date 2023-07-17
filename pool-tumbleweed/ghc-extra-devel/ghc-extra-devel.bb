SUMMARY = "Haskell extra library development files"
DESCRIPTION = "This package provides the Haskell extra library development files."
LICENSE = "BSD-3-Clause"

PV = "1.7.14"

RPM_NAME = "ghc-extra-devel-1.7.14-1.1.aarch64.rpm"
RPM_HASH = "d91b9aece196134643367a46ea1e232514c0b566de010b7bd2adb3dea03a2e35a82f9ac1e204e7fc8ac48bfffcdb3ab91c27dc906a68e7fa4e8250173901393e"

RPROVIDES:${PN} += "ghc-devel-extra-1.7.14-BoqGpItPSHp5TXSaJGSPpo \
ghc-extra-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-clock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.16.0 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-extra"

inherit rpm
