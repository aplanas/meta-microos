SUMMARY = "Haskell math-functions library development files"
DESCRIPTION = "This package provides the Haskell math-functions library development files."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.2"

RPM_NAME = "ghc-math-functions-devel-0.3.4.2-2.8.aarch64.rpm"
RPM_HASH = "e7b9031264939876a457083c47cfb404e303b1660fc431931366560462e36d2d8a17cbd8b5792ea2f7110b579a7e9dbcce3ba101eb13e72248534bac58f96af4"

RPROVIDES:${PN} += "ghc-devel-math-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR \
ghc-math-functions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-math-functions"

inherit rpm
