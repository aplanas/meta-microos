SUMMARY = "Haskell primitive profiling library"
DESCRIPTION = "This package provides the Haskell primitive profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.0"

RPM_NAME = "ghc-primitive-prof-0.7.4.0-1.8.aarch64.rpm"
RPM_HASH = "086f3f11000f2f4466a0c5cbc8500aee238cfc735174405dc281b523927d5e6da1ad4df79db61faa6df2cbca47ffe74cbe3e109d3aa6ef36fe7ef2bc64b5b4d7"

RPROVIDES:${PN} += "ghc-primitive-prof \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx"

RDEPENDS:${PN} += "ghc-primitive-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
