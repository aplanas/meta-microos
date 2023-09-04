SUMMARY = "Haskell timezone-series library development files"
DESCRIPTION = "This package provides the Haskell timezone-series library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-devel-0.1.13-2.3.aarch64.rpm"
RPM_HASH = "a8cd832d4c7f9b7a80aaacdf1760fd4c5f4be6f327d3b9e90a8e168cf449dedc7b837d219601f0518c70f317cb11c3816fa6d25b40e0925408abd7080356abbf"

RPROVIDES:${PN} += "ghc-devel-timezone-series-0.1.13-IHWQx2h4brT4vl06IuBnhA \
ghc-timezone-series-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-time-1.12.2 \
ghc-timezone-series"

inherit rpm
