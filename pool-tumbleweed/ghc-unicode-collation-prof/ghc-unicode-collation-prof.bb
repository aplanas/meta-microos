SUMMARY = "Haskell unicode-collation profiling library"
DESCRIPTION = "This package provides the Haskell unicode-collation profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.4"

RPM_NAME = "ghc-unicode-collation-prof-0.1.3.4-1.6.aarch64.rpm"
RPM_HASH = "c6a041aa26f69a81217e579351b51ddae84ea5bdb44cfcefe5eb385d1caff09afae56685f72e283617e39ce5b63e0918c4eda0119e65574e2681e5d69f7c400a"

RPROVIDES:${PN} += "ghc-prof-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-unicode-collation-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-th-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx \
ghc-unicode-collation-devel"

inherit rpm
