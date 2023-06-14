SUMMARY = "Haskell dlist profiling library"
DESCRIPTION = "This package provides the Haskell dlist profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-prof-1.0-3.2.aarch64.rpm"
RPM_HASH = "4cf99bcfd4802109c0d75de638a93d15c9196cb011f407367eb6029e10635321cc6bffb8e2094b944af8bf1d48104852e7c582199c05eb2d72b9d6211fbc2452"

RPROVIDES:${PN} += "ghc-dlist-prof \
ghc-prof-dlist-1.0-BmTLN13CmmLQvuHz7BjP9"

RDEPENDS:${PN} += "ghc-dlist-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
