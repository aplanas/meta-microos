SUMMARY = "Haskell hslua-classes profiling library"
DESCRIPTION = "This package provides the Haskell hslua-classes profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-classes-prof-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "d6d17caf0aa2ab9ac678f26311cac13aa682ab1d61bb8b223132b2c256071849ba7fcd991d5553041c9af9350c6f9e5abcb1195ff4b95db28e3752cec2f8b5c4"

RPROVIDES:${PN} += "ghc-hslua-classes-prof ghc-hslua-classes-prof(aarch-64) ghc-prof(hslua-classes-2.3.0-FmFATpNcre9GneTlejjsY7)"
RDEPENDS:${PN} += "ghc-hslua-classes-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(exceptions-0.10.5) ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) ghc-prof(text-2.0.2)"

inherit rpm
