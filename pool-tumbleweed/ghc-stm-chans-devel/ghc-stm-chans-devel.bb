SUMMARY = "Haskell stm-chans library development files"
DESCRIPTION = "This package provides the Haskell stm-chans library development files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-devel-3.0.0.9-1.6.aarch64.rpm"
RPM_HASH = "6b1a3fa9938a6a279cfadcc5ca9830e4e51bf4a9c503460dff20b5c2a534cab792d704a052170d60a3b034f28e1c35a2e8809c1d23cac46dccb0ea338e428cd8"

RPROVIDES:${PN} += "ghc-devel-stm-chans-3.0.0.9-KwAuYyoo9r3GoiDPqmpN5R \
ghc-stm-chans-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-stm-2.5.1.0 \
ghc-stm-chans"

inherit rpm
