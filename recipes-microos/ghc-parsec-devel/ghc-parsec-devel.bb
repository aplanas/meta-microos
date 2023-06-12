SUMMARY = "Haskell parsec library development files"
DESCRIPTION = "This package provides the Haskell parsec library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-devel-3.1.16.1-3.1.aarch64.rpm"
RPM_HASH = "0cbdfc60a39a212506e97cee91c72173c0a4c63f9b6b76c16b6774f721188c3594dccc0a21fb12f401b3d6f8b2974cd27a12b892d90895fd5a72244d53e0a7ad"

RPROVIDES:${PN} += "ghc-devel(parsec-3.1.16.1) ghc-parsec-devel ghc-parsec-devel(aarch-64) ghc-parsec-static ghc-parsec-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(mtl-2.2.2) ghc-devel(text-2.0.2) ghc-parsec(aarch-64)"

inherit rpm
