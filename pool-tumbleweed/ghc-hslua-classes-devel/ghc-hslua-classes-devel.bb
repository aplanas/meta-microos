SUMMARY = "Haskell hslua-classes library development files"
DESCRIPTION = "This package provides the Haskell hslua-classes library development files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-classes-devel-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "e9739bfaeed72da31e30bb34a1cc68a5487a5ba14b2051c1c08e7031959fef27531d82e78b87bd02475a51b23fb981a6195176da2868ef81033d384801728f85"

RPROVIDES:${PN} += "ghc-devel-hslua-classes-2.3.0-FmFATpNcre9GneTlejjsY7 \
ghc-hslua-classes-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-devel-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-devel-text-2.0.2 \
ghc-hslua-classes"

inherit rpm
