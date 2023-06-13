SUMMARY = "Haskell monad-logger library development files"
DESCRIPTION = "This package provides the Haskell monad-logger library development files."
LICENSE = "MIT"

PV = "0.3.39"

RPM_NAME = "ghc-monad-logger-devel-0.3.39-2.4.aarch64.rpm"
RPM_HASH = "027a8cd5d12cf5a50fb1e3e0980c3ae6ecc24038f60ede085044baa637f6f5a41d5f38fab355ce423c1e1dbd66a69aabf56632d06bb89b7fe8bcf1c010452122"

RPROVIDES:${PN} += "ghc-devel(monad-logger-0.3.39-6zcML8Hf5KyK4tRVcaUTsA) \
ghc-monad-logger-devel \
ghc-monad-logger-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ) \
ghc-devel(lifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo) \
ghc-devel(monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX) \
ghc-devel(monad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9) \
ghc-devel(mtl-2.2.2) \
ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-devel(stm-2.5.1.0) \
ghc-devel(stm-chans-3.0.0.9-KwAuYyoo9r3GoiDPqmpN5R) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp) \
ghc-devel(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd) \
ghc-devel(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj) \
ghc-monad-logger"

inherit rpm
