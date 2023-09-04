SUMMARY = "Haskell HUnit library development files"
DESCRIPTION = "This package provides the Haskell HUnit library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-devel-1.6.2.0-2.8.aarch64.rpm"
RPM_HASH = "c3cb2de9b37a65c55adc66eb44401c00b7ed6618303055ed4fc54a792c22c1f7b64e5bf768f6c6e683dc96d4d43f302e45a11c13449960f6ab3c3658272580d6"

RPROVIDES:${PN} += "ghc-HUnit-devel \
ghc-devel-HUnit-1.6.2.0-3fsauNNRJvI5u5lqiyApf4"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-HUnit \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt \
ghc-devel-deepseq-1.4.8.0"

inherit rpm
