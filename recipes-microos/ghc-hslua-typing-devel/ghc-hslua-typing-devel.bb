SUMMARY = "Haskell hslua-typing library development files"
DESCRIPTION = "This package provides the Haskell hslua-typing library development files."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "ghc-hslua-typing-devel-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "4e2dfa1bb45c071044ce836f5bc733b263c0afda11b428e257b8f1840f28e3691ad08817baebdaed97b232e921b26f225ef18162bda3dda05080db6de7d61ad5"

RPROVIDES:${PN} += "ghc-devel(hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj) ghc-hslua-typing-devel ghc-hslua-typing-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) ghc-devel(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) ghc-devel(text-2.0.2) ghc-hslua-typing"

inherit rpm
