SUMMARY = "Haskell old-time library development files"
DESCRIPTION = "This package provides the Haskell old-time library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-devel-1.1.0.3-13.2.aarch64.rpm"
RPM_HASH = "de8031315ee25fea5aedddf82fac3f4215c94a8753e378bc1f07ca2803ad924b5cf07de952a68d7ea3ca2ebc20eeb0cd2a4f081eec144428dda0543e7d991f2d"

RPROVIDES:${PN} += "ghc-devel-old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1 \
ghc-old-time-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR \
ghc-old-time"

inherit rpm
