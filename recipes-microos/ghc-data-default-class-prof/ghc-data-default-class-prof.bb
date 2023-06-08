SUMMARY = "Haskell data-default-class profiling library"
DESCRIPTION = "This package provides the Haskell data-default-class profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-data-default-class-prof-0.1.2.0-10.2.aarch64.rpm"
RPM_HASH = "cb50e63c803f08d8e9eaf0b6f44821609638d74f22516926d7047411f5dce2ce9dc558fb267c1f1f707bb64200ad8ebc4a96a2b3bf8ae60deb91df1827961a66"

RPROVIDES:${PN} += "ghc-data-default-class-prof ghc-data-default-class-prof(aarch-64) ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ)"
RDEPENDS:${PN} += "ghc-data-default-class-devel ghc-prof(base-4.17.1.0)"

inherit rpm
