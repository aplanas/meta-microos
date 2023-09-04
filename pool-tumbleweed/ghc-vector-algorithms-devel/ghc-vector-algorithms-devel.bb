SUMMARY = "Haskell vector-algorithms library development files"
DESCRIPTION = "This package provides the Haskell vector-algorithms library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.9.0.1"

RPM_NAME = "ghc-vector-algorithms-devel-0.9.0.1-1.9.aarch64.rpm"
RPM_HASH = "7a4eab3e7c552e2db6f619511a6533c110d094c2c1c9013df5c686b0f354a916ad7585b30f321e0274da27bc15122ece6ba14b085c1eae68d931e4dd73c73caa"

RPROVIDES:${PN} += "ghc-devel-vector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr \
ghc-vector-algorithms-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bitvec-1.1.5.0-4n2vDaVO5x4GAoTGOlyPxS \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-vector-algorithms"

inherit rpm
