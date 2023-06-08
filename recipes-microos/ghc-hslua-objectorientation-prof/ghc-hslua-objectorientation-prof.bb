SUMMARY = "Haskell hslua-objectorientation profiling library"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-objectorientation-prof-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "48ed8be2378b67712f2688d0ff66613ef8f9e719562f05c834d2e0e4b018047f1768b7eed7620d97dd34414363de38f954d127d60d3d7b9637949986377fb56c"

RPROVIDES:${PN} += "ghc-hslua-objectorientation-prof ghc-hslua-objectorientation-prof(aarch-64) ghc-prof(hslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl)"
RDEPENDS:${PN} += "ghc-hslua-objectorientation-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(exceptions-0.10.5) ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) ghc-prof(hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj) ghc-prof(mtl-2.2.2) ghc-prof(text-2.0.2)"

inherit rpm
