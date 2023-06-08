SUMMARY = "Haskell persistent-sqlite profiling library"
DESCRIPTION = "This package provides the Haskell persistent-sqlite profiling library."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-prof-2.13.1.1-2.4.aarch64.rpm"
RPM_HASH = "ef020ae7e762403e71c79998205a0deb69bfa991478a63e550386a08e0bb6e356100a0239efaa6dcffe25ffb15f509ad9e423f2a1e559f772bef3eb2219e63f2"

RPROVIDES:${PN} += "ghc-persistent-sqlite-prof ghc-persistent-sqlite-prof(aarch-64) ghc-prof(persistent-sqlite-2.13.1.1-6m8kOitQFXeAVXzn0JSxB5)"
RDEPENDS:${PN} += "ghc-persistent-sqlite-devel ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) ghc-prof(containers-0.6.7) ghc-prof(microlens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG) ghc-prof(monad-logger-0.3.39-6zcML8Hf5KyK4tRVcaUTsA) ghc-prof(mtl-2.2.2) ghc-prof(persistent-2.14.5.0-52EbT4CA3Ct4CmrnsbaA80) ghc-prof(resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW) ghc-prof(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) ghc-prof(text-2.0.2) ghc-prof(time-1.12.2) ghc-prof(transformers-0.5.6.2) ghc-prof(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj) ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E)"

inherit rpm
