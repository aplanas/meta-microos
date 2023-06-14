SUMMARY = "Haskell hpc profiling library"
DESCRIPTION = "This package provides the Haskell hpc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-prof-0.6.1.0-3.1.aarch64.rpm"
RPM_HASH = "a2530eaaf5ad014fd669a1cbab85c4234deaa63f97ca601468814fbfcf22bbd894446c35cdf686926408efbcb213db8135a7a2400921499232cd1887d9696e4c"

RPROVIDES:${PN} += "ghc-hpc-prof \
ghc-prof-hpc-0.6.1.0"

RDEPENDS:${PN} += "ghc-hpc-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-time-1.12.2"

inherit rpm
