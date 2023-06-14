SUMMARY = "Haskell pretty-hex profiling library"
DESCRIPTION = "This package provides the Haskell pretty-hex profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-prof-1.1-4.2.aarch64.rpm"
RPM_HASH = "4c9a656fa314d28344066ec4002fa30876897715345eda273bc58d56b40fd8c3449043608edcd129e48bfe155c0135ce25be627f35fe7b257f4ec54621c0756d"

RPROVIDES:${PN} += "ghc-pretty-hex-prof \
ghc-prof-pretty-hex-1.1-2861Nkv8pS0CIRpZJwwJMG"

RDEPENDS:${PN} += "ghc-pretty-hex-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0"

inherit rpm
