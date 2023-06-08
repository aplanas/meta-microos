SUMMARY = "Haskell primitive library development files"
DESCRIPTION = "This package provides the Haskell primitive library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.0"

RPM_NAME = "ghc-primitive-devel-0.7.4.0-1.3.aarch64.rpm"
RPM_HASH = "40677957ac08cb9a253c5ed73e4a2016ae2fddeddecdd51a019b568d51140906bf76f2129fde2281fd33a1d68ca73c04dc65a383eceb4fb17555abf1dd196e61"

RPROVIDES:${PN} += "ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-primitive-devel ghc-primitive-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(deepseq-1.4.8.0) ghc-devel(template-haskell-2.19.0.0) ghc-devel(transformers-0.5.6.2) ghc-primitive"

inherit rpm
