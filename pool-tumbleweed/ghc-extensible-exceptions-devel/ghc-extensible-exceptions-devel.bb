SUMMARY = "Haskell extensible-exceptions library development files"
DESCRIPTION = "This package provides the Haskell extensible-exceptions library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-devel-0.1.1.4-7.2.aarch64.rpm"
RPM_HASH = "b67d4177aa97154c1ed59b9ae24410c76adfc94d64950ca46d5e61b17c5d980eb0718e2f7907336983c9f50f7bd210f1a50d2133a8a974f71343268a8fe6e30b"

RPROVIDES:${PN} += "ghc-devel(extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY) \
ghc-extensible-exceptions-devel \
ghc-extensible-exceptions-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-extensible-exceptions"

inherit rpm
