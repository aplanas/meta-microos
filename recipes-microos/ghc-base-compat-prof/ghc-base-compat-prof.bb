SUMMARY = "Haskell base-compat profiling library"
DESCRIPTION = "This package provides the Haskell base-compat profiling library."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "ghc-base-compat-prof-0.12.2-2.3.aarch64.rpm"
RPM_HASH = "b04639609ff3c7bf81ecdc784a1c8849c0acf2b99078e28872446f3cafcd29c9baf8f5620d68334402469d6fa101442cd4f7724644077557b0ee6e53c4ddfecf"

RPROVIDES:${PN} += "ghc-base-compat-prof ghc-base-compat-prof(aarch-64) ghc-prof(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov)"
RDEPENDS:${PN} += "ghc-base-compat-devel ghc-prof(base-4.17.1.0) ghc-prof(ghc-prim-0.9.0) ghc-prof(unix-2.7.3)"

inherit rpm
