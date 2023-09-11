SUMMARY = "Haskell skylighting profiling library"
DESCRIPTION = "This package provides the Haskell skylighting profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-prof-0.13.4.1-1.6.aarch64.rpm"
RPM_HASH = "4a1fe1aebcb9d1b68627fdad158a198bc74f4423e4c415f1bad354ed7dde780332fa3f3af23adf0032da5f77e368950fbbf9ef49a1946cf23efd7ddf1f131ea5"

RPROVIDES:${PN} += "ghc-prof-skylighting-0.13.4.1-154hDBm9lstJ5eMNDkHcA5 \
ghc-skylighting-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-LOkep7AnSNN7QJDAXr031n \
ghc-prof-skylighting-format-ansi-0.1-8FyF1SOujOsEQ3XyvF7m1i \
ghc-prof-skylighting-format-blaze-html-0.1.1.1-8h5SzfFcahBGtm6dLTrui7 \
ghc-prof-skylighting-format-context-0.1.0.2-4E6TECMrJ1JH7PHte3jxUC \
ghc-prof-skylighting-format-latex-0.1-8a642fGNkPX9imnZQBlyrP \
ghc-skylighting-devel"

inherit rpm
