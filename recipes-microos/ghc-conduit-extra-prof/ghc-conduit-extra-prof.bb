SUMMARY = "Haskell conduit-extra profiling library"
DESCRIPTION = "This package provides the Haskell conduit-extra profiling library."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "ghc-conduit-extra-prof-1.3.6-2.5.aarch64.rpm"
RPM_HASH = "ba8c0af3f154844c3c4149afc1fa53e99df910139675d0b65408967ea55cbf7a021ad139a80d376355c1e96f8d8da896f0a7ca2bcba72ef1a9948f08884ae878"

RPROVIDES:${PN} += "ghc-conduit-extra-prof ghc-conduit-extra-prof(aarch-64) ghc-prof(conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr)"
RDEPENDS:${PN} += "ghc-conduit-extra-devel ghc-prof(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) ghc-prof(directory-1.3.7.1) ghc-prof(filepath-1.4.2.2) ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) ghc-prof(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-prof(process-1.6.16.0) ghc-prof(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) ghc-prof(stm-2.5.1.0) ghc-prof(streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G) ghc-prof(text-2.0.2) ghc-prof(transformers-0.5.6.2) ghc-prof(typed-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO) ghc-prof(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj)"

inherit rpm
