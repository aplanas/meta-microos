SUMMARY = "Haskell vector profiling library"
DESCRIPTION = "This package provides the Haskell vector profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.0.0"

RPM_NAME = "ghc-vector-prof-0.13.0.0-3.2.aarch64.rpm"
RPM_HASH = "ce3199eb17f0f636a98db4453b54c38dbdcec37a3882f74d38164634e559a936cb779de735a7744a2ae9292d41913dbbe08aef9cdd38f27462a9e24d6f1dff10"

RPROVIDES:${PN} += "ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-vector-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-vector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB \
ghc-vector-devel"

inherit rpm
