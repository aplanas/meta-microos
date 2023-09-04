SUMMARY = "Haskell colourista library development files"
DESCRIPTION = "This package provides the Haskell colourista library development files."
LICENSE = "MPL-2.0"

PV = "0.1.0.2"

RPM_NAME = "ghc-colourista-devel-0.1.0.2-2.2.aarch64.rpm"
RPM_HASH = "dc1b38c06cf25ee7696997ef0164cd619e00b4c68af71103209c5d50d8df09df3757335d814e3d13abe31e6a36097e7e16f87f6bcbb2236cf9b3e18113c143ca"

RPROVIDES:${PN} += "ghc-colourista-devel \
ghc-devel-colourista-0.1.0.2-19lLFYWP0ZEDfSw3obIpeF"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-colourista \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-text-2.0.2"

inherit rpm
