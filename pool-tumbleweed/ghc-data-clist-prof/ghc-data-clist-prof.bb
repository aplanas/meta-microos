SUMMARY = "Haskell data-clist profiling library"
DESCRIPTION = "This package provides the Haskell data-clist profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-prof-0.2-2.3.aarch64.rpm"
RPM_HASH = "fcd3def62d4acf502c9c16a8efcad91e23bfb0feb3ada5cc56c26fc881e42c3cfa0c4b37feb7496a8bbb1db6874eaf1326b590e70eea41501319d735ee505180"

RPROVIDES:${PN} += "ghc-data-clist-prof \
ghc-prof-data-clist-0.2-2XS2LK92Ow8274ZzRlQjKH"

RDEPENDS:${PN} += "ghc-data-clist-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
