SUMMARY = "Haskell http-media profiling library"
DESCRIPTION = "This package provides the Haskell http-media profiling library."
LICENSE = "MIT"

PV = "0.8.0.0"

RPM_NAME = "ghc-http-media-prof-0.8.0.0-6.3.aarch64.rpm"
RPM_HASH = "b8dd63e08a2915a7ba30d468af34c354e2e8ec59766557741d6ca48905f500a1383c302a71cb1cf44cb2e6c71e7c33b96bc1780745bf603985c53857bce24fc2"

RPROVIDES:${PN} += "ghc-http-media-prof ghc-http-media-prof(aarch-64) ghc-prof(http-media-0.8.0.0-9GHxrTRagkN589CoQuo7sU)"
RDEPENDS:${PN} += "ghc-http-media-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) ghc-prof(containers-0.6.7) ghc-prof(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q)"

inherit rpm
