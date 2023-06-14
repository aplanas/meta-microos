SUMMARY = "Haskell utf8-string profiling library"
DESCRIPTION = "This package provides the Haskell utf8-string profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-prof-1.0.2-2.3.aarch64.rpm"
RPM_HASH = "c9d356546a4fc8a3e4a084f789b66e2997a0a9b6d9a7079cc28e13b9b814ce055d29e9199a504a5a22b884cab5690307fe38b2321fb576432f17bcb0c5cb5fc2"

RPROVIDES:${PN} += "ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-utf8-string-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-utf8-string-devel"

inherit rpm
