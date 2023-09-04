SUMMARY = "Haskell statistics library development files"
DESCRIPTION = "This package provides the Haskell statistics library development files."
LICENSE = "BSD-2-Clause"

PV = "0.16.2.0"

RPM_NAME = "ghc-statistics-devel-0.16.2.0-1.10.aarch64.rpm"
RPM_HASH = "46c4ee448a89eef4e72a5c9b8b6fb120d07ee4836876a568675318e588ebecd3bbf60755af86fef4269c71dfab3de202a24f3e0f83e20bf8bfc07e0a92b93acc"

RPROVIDES:${PN} += "ghc-devel-statistics-0.16.2.0-Dp1JycEUxrUOwl2iaVmzC \
ghc-statistics-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-dense-linear-algebra-0.1.0.0-FqLdJ2617mhFbXxVUig9Jj \
ghc-devel-math-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR \
ghc-devel-mwc-random-0.15.0.2-9nri7BsVv5CBC89QkshOkp \
ghc-devel-parallel-3.2.2.0-4HmomK1BnRHCRUDqhNxOgQ \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-vector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr \
ghc-devel-vector-binary-instances-0.2.5.2-DYVTg98S1IFCZ0TRySxTVW \
ghc-devel-vector-th-unbox-0.2.2-4Hl5syaTqnL4b2rNrCiqzQ \
ghc-statistics"

inherit rpm
