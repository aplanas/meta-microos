SUMMARY = "Haskell binary profiling library"
DESCRIPTION = "This package provides the Haskell binary profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-prof-0.8.9.1-1.1.aarch64.rpm"
RPM_HASH = "85b7e67221bd4a81d06234ecfc4b0936480e39bced49837551cf5f19ef9b10949c540d7793f1569c0ec15d7d1cf91dca4a297c7a606b40a7872cd5c715b8fa7b"

RPROVIDES:${PN} += "ghc-binary-prof ghc-binary-prof(aarch-64) ghc-prof(binary-0.8.9.1)"
RDEPENDS:${PN} += "ghc-binary-devel(aarch-64) ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7)"

inherit rpm
