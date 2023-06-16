SUMMARY = "Haskell hslua-marshalling library development files"
DESCRIPTION = "This package provides the Haskell hslua-marshalling library development \
files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-marshalling-devel-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "854fc6fe7a0a7812bdd88edee5037dd77ff27f8e72e85264a6a5ff3aef45858fd3fa18f422863bae00277c49b185a4b3663ee10c917a370747abc2fa3ce16804"

RPROVIDES:${PN} += "ghc-devel-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-hslua-marshalling-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-hslua-marshalling"

inherit rpm
