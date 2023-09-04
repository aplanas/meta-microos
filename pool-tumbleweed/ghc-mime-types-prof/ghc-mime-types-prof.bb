SUMMARY = "Haskell mime-types profiling library"
DESCRIPTION = "This package provides the Haskell mime-types profiling library."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-mime-types-prof-0.1.1.0-2.3.aarch64.rpm"
RPM_HASH = "81b2fe1885e3c9ee352209858aad722b54421b24dc6471f5578899c648eb35d4a891698634f2d3efa16fbef5ab2a59e06b51ddc0e772826eb637645addb70d13"

RPROVIDES:${PN} += "ghc-mime-types-prof \
ghc-prof-mime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab"

RDEPENDS:${PN} += "ghc-mime-types-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-text-2.0.2"

inherit rpm
