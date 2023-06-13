SUMMARY = "Haskell lift-type profiling library"
DESCRIPTION = "This package provides the Haskell lift-type profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-lift-type-prof-0.1.1.1-2.2.aarch64.rpm"
RPM_HASH = "5388ad8efe2604a553730401ee5a8a335099e865d6a36c098ca412b2c74cd92e539d25fc33cb88eee9ba490f4988501cc73c1682b08d21a47c9addb6db86ae0c"

RPROVIDES:${PN} += "ghc-lift-type-prof \
ghc-lift-type-prof(aarch-64) \
ghc-prof(lift-type-0.1.1.1-2p47b0Ftg8mEbzaiZ22oeB)"

RDEPENDS:${PN} += "ghc-lift-type-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(template-haskell-2.19.0.0)"

inherit rpm
