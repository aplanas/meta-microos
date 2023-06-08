SUMMARY = "Haskell appar library development files"
DESCRIPTION = "This package provides the Haskell appar library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-devel-0.1.8-4.2.aarch64.rpm"
RPM_HASH = "952020a64a08a3126d01d6fc9e357939bb4eb34395f5b492358c2fc0217ab7d4cb708d01e3e6d4d0429858fac5d2aad962249a8bbdd6105cff3349dcf4542419"

RPROVIDES:${PN} += "ghc-appar-devel ghc-appar-devel(aarch-64) ghc-devel(appar-0.1.8-JYpyJYPkUOgKorqU8WSWRv)"
RDEPENDS:${PN} += "/bin/sh ghc-appar ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0)"

inherit rpm
