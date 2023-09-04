SUMMARY = "Haskell resolv library development files"
DESCRIPTION = "This package provides the Haskell resolv library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2.0"

RPM_NAME = "ghc-resolv-devel-0.1.2.0-10.8.aarch64.rpm"
RPM_HASH = "7647fc86529a4a601f20990c3fffbee7e5d215dec173f27b2acb84c64b439de3fcceb71c44dad2aee23e374b993cbd1c732f17f63933cc02172d990d3795a3f7"

RPROVIDES:${PN} += "ghc-devel-resolv-0.1.2.0-LPfwrdmMO1tC4Sn0ebxMDl \
ghc-resolv-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-resolv"

inherit rpm
