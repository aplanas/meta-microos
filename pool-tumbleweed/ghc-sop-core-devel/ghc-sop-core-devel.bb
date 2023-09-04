SUMMARY = "Haskell sop-core library development files"
DESCRIPTION = "This package provides the Haskell sop-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-devel-0.5.0.2-4.8.aarch64.rpm"
RPM_HASH = "daff03a89ddb664ead7a7a5863dcefd8a137a08984354fb96319c98637d738e66407c7282717a4edac823749a012ee81268e71f9da4b74aa033e090594723028"

RPROVIDES:${PN} += "ghc-devel-sop-core-0.5.0.2-4Gqw6OnhbZAJM3BBTi5hGD \
ghc-sop-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-sop-core"

inherit rpm
