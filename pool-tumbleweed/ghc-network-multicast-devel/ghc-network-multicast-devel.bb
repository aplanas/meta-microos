SUMMARY = "Haskell network-multicast library development files"
DESCRIPTION = "This package provides the Haskell network-multicast library development \
files."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-devel-0.3.2-4.4.aarch64.rpm"
RPM_HASH = "60f2aefa829f9caebf14e87dcb01e745873af49ea33877b5834fa5eea529eb1f5b0c4b6b952f57562b800e015de577818e8beb48fb7612f7e8faa5183e9bc801"

RPROVIDES:${PN} += "ghc-devel-network-multicast-0.3.2-49FavpxpKt9CEnvETsCD9h \
ghc-network-multicast-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-bsd-2.8.1.0-6HwBWPM2Dri1VSrR1y6aDh \
ghc-network-multicast"

inherit rpm
