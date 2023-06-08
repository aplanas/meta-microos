SUMMARY = "Haskell old-locale profiling library"
DESCRIPTION = "This package provides the Haskell old-locale profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-prof-1.0.0.7-13.2.aarch64.rpm"
RPM_HASH = "6c931695281f200d1b00276d6535d363aff29458788a9b585847194888a1657c510cac82cafafa98a61f842c9acb1a8d1f9f8ece208366d156ab27f48107c645"

RPROVIDES:${PN} += "ghc-old-locale-prof ghc-old-locale-prof(aarch-64) ghc-prof(old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR)"
RDEPENDS:${PN} += "ghc-old-locale-devel ghc-prof(base-4.17.1.0)"

inherit rpm
