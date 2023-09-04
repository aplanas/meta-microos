SUMMARY = "Haskell extra library development files"
DESCRIPTION = "This package provides the Haskell extra library development files."
LICENSE = "BSD-3-Clause"

PV = "1.7.14"

RPM_NAME = "ghc-extra-devel-1.7.14-1.3.aarch64.rpm"
RPM_HASH = "25c8c5f869b1f7859ee893b35c5d46c9acd44682e7bf1338fec4c1837903b5a1422b9631b4edbabbb26dc0da82337e8d2b30c7bc90a8cf45f01e5c9d7d0abd0c"

RPROVIDES:${PN} += "ghc-devel-extra-1.7.14-DfcUn0kURmM7zhMG6RTp91 \
ghc-extra-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-clock-0.8.4-FaEd7XcSjZTFKcoXlUaX3W \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.17.0 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-extra"

inherit rpm
