SUMMARY = "Haskell filepath-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell filepath-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.1.13"

RPM_NAME = "ghc-filepath-bytestring-prof-1.4.2.1.13-1.3.aarch64.rpm"
RPM_HASH = "05b154abe094bfbfd0aced5d60ccef1c33e02be7a860c9f9eb5b130c3721e98a4def54217526f2ab992aeeaf39139ad47a687ff9fdc954119c562923bca42361"

RPROVIDES:${PN} += "ghc-filepath-bytestring-prof \
ghc-prof-filepath-bytestring-1.4.2.1.13-1FmfoCrfLITG59KaBERpzO"

RDEPENDS:${PN} += "ghc-filepath-bytestring-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-unix-2.7.3"

inherit rpm
