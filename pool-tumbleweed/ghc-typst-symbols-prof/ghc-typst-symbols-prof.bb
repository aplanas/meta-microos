SUMMARY = "Haskell typst-symbols profiling library"
DESCRIPTION = "This package provides the Haskell typst-symbols profiling library."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-typst-symbols-prof-0.1.2-1.1.aarch64.rpm"
RPM_HASH = "52f3892dfab9b36a10cdb0e379157d63beef6e71a4b3376a52dacac9b2a245066391628231a127efd464e8a3b0c90f4533c49b5465a77df32ebcf47527c32900"

RPROVIDES:${PN} += "ghc-prof-typst-symbols-0.1.2-6B3ZvJm94WZ4qfFjRZShld \
ghc-typst-symbols-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-text-2.0.2 \
ghc-typst-symbols-devel"

inherit rpm
