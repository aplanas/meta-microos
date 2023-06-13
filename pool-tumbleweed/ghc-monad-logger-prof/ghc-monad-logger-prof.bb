SUMMARY = "Haskell monad-logger profiling library"
DESCRIPTION = "This package provides the Haskell monad-logger profiling library."
LICENSE = "MIT"

PV = "0.3.39"

RPM_NAME = "ghc-monad-logger-prof-0.3.39-2.4.aarch64.rpm"
RPM_HASH = "9601cb5528e7f5504a46876227cc12a3f524786a48a974d9d5875d39653cdd95266d6af204ffdb08e3cf73d5ad2eebc19b469f989b4fa23929534c5ef3eab4fe"

RPROVIDES:${PN} += "ghc-monad-logger-prof \
ghc-monad-logger-prof(aarch-64) \
ghc-prof(monad-logger-0.3.39-6zcML8Hf5KyK4tRVcaUTsA)"

RDEPENDS:${PN} += "ghc-monad-logger-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-prof(conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ) \
ghc-prof(lifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo) \
ghc-prof(monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX) \
ghc-prof(monad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9) \
ghc-prof(mtl-2.2.2) \
ghc-prof(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-prof(stm-2.5.1.0) \
ghc-prof(stm-chans-3.0.0.9-KwAuYyoo9r3GoiDPqmpN5R) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(text-2.0.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp) \
ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd) \
ghc-prof(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj)"

inherit rpm
