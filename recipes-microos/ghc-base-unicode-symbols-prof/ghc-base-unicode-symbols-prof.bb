SUMMARY = "Haskell base-unicode-symbols profiling library"
DESCRIPTION = "This package provides the Haskell base-unicode-symbols profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.4.2"

RPM_NAME = "ghc-base-unicode-symbols-prof-0.2.4.2-1.2.aarch64.rpm"
RPM_HASH = "85d18de8e6416814d9d5c59be9504b25091c7bfe797d02f8fc27d52d16d2041728cd59471f5bff8bc6117de9ac08327af23c127a428fe221702504b820fbb45c"

RPROVIDES:${PN} += "ghc-base-unicode-symbols-prof ghc-base-unicode-symbols-prof(aarch-64) ghc-prof(base-unicode-symbols-0.2.4.2-2uW4hd16ZmNBkWsH22htOC)"
RDEPENDS:${PN} += "ghc-base-unicode-symbols-devel ghc-prof(base-4.17.1.0)"

inherit rpm
