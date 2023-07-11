SUMMARY = "Haskell zlib library development files"
DESCRIPTION = "This package provides the Haskell zlib library development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-devel-0.6.3.0-2.6.aarch64.rpm"
RPM_HASH = "65f2ed51670feac0472e544be2679cc00445641af8afd263a2a73f20a4b3e2197eb859c2ac5cdfe58fd64b2242e1e8f19ad3bf160c1018906853819890ba1731"

RPROVIDES:${PN} += "ghc-devel-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-zlib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-zlib \
zlib-devel"

inherit rpm
