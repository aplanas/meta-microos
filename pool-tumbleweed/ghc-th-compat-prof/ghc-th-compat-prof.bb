SUMMARY = "Haskell th-compat profiling library"
DESCRIPTION = "This package provides the Haskell th-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-th-compat-prof-0.1.4-3.1.aarch64.rpm"
RPM_HASH = "248183d0b90096cb2b7003bc3e7fcb12f85254ba0027a90e5baff36521ffc4594f788216d71ab2319b2b925c5a460561596e2f01b8e82da672c826b0d6ca20e8"

RPROVIDES:${PN} += "ghc-prof-th-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS \
ghc-th-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-th-compat-devel"

inherit rpm
