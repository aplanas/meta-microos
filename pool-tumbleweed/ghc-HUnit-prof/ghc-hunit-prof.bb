SUMMARY = "Haskell HUnit profiling library"
DESCRIPTION = "This package provides the Haskell HUnit profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-prof-1.6.2.0-2.8.aarch64.rpm"
RPM_HASH = "c0c23f2ee9a2ff064f2cde7a197788154883e1db7399557c9926137facd6efacc5150dcb0d3bb4c3eb846fc6c58cec0e7b540e1771c93cc71dbb8cd0ae5983b9"

RPROVIDES:${PN} += "ghc-HUnit-prof \
ghc-prof-HUnit-1.6.2.0-3fsauNNRJvI5u5lqiyApf4"

RDEPENDS:${PN} += "ghc-HUnit-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
