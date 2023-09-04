SUMMARY = "Haskell time profiling library"
DESCRIPTION = "This package provides the Haskell time profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-prof-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "58ea4d9cd31578d106c86122a1949bcf4c8b5af82dcdd86de25835e373400cdf431fc1337001a19f67cd562a8d26078fc0aa9981833e15124b57d3f227cef541"

RPROVIDES:${PN} += "ghc-prof-time-1.12.2 \
ghc-time-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-time-devel"

inherit rpm
