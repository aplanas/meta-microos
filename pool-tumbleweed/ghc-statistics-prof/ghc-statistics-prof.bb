SUMMARY = "Haskell statistics profiling library"
DESCRIPTION = "This package provides the Haskell statistics profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.16.2.0"

RPM_NAME = "ghc-statistics-prof-0.16.2.0-1.10.aarch64.rpm"
RPM_HASH = "53b31c2d2dfccb00428937374e480ea3e611129782fd3a94f4e450f707517fc6349f14ac341d2ef4141faf955d0fecd49191168ed44beaf14994834ea3cd7e7e"

RPROVIDES:${PN} += "ghc-prof-statistics-0.16.2.0-Dp1JycEUxrUOwl2iaVmzC \
ghc-statistics-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-dense-linear-algebra-0.1.0.0-FqLdJ2617mhFbXxVUig9Jj \
ghc-prof-math-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR \
ghc-prof-mwc-random-0.15.0.2-9nri7BsVv5CBC89QkshOkp \
ghc-prof-parallel-3.2.2.0-4HmomK1BnRHCRUDqhNxOgQ \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-vector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr \
ghc-prof-vector-binary-instances-0.2.5.2-DYVTg98S1IFCZ0TRySxTVW \
ghc-prof-vector-th-unbox-0.2.2-4Hl5syaTqnL4b2rNrCiqzQ \
ghc-statistics-devel"

inherit rpm
