SUMMARY = "Haskell hslua-typing profiling library"
DESCRIPTION = "This package provides the Haskell hslua-typing profiling library."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "ghc-hslua-typing-prof-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "de53d1deb2b50e52a21c9f87a9e5227e07ba061211e439bcc4f2a0f38964007db3e7fbcd489ac30f016f1cb5b376b64cf2c5a777eb18437877010cb0d92c1e6a"

RPROVIDES:${PN} += "ghc-hslua-typing-prof ghc-hslua-typing-prof(aarch-64) ghc-prof(hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj)"
RDEPENDS:${PN} += "ghc-hslua-typing-devel ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) ghc-prof(text-2.0.2)"

inherit rpm
