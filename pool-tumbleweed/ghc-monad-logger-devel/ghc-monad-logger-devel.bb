SUMMARY = "Haskell monad-logger library development files"
DESCRIPTION = "This package provides the Haskell monad-logger library development files."
LICENSE = "MIT"

PV = "0.3.40"

RPM_NAME = "ghc-monad-logger-devel-0.3.40-1.2.aarch64.rpm"
RPM_HASH = "8fb2df4ba4f1f8d0269af4fd1040a716aa52aee74dc90f2740e0df07f6a0d952dd0c438f180a95f450945b14b5089110df9368b72a9501537d2899972894f15f"

RPROVIDES:${PN} += "ghc-devel-monad-logger-0.3.40-G052AHl2mRW3aPPonmcvVW \
ghc-monad-logger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-fast-logger-3.1.2-B9zh4yvWMU69CA1ZW1MVtN \
ghc-devel-lifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo \
ghc-devel-monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX \
ghc-devel-monad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9 \
ghc-devel-mtl-2.2.2 \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-stm-2.5.1.0 \
ghc-devel-stm-chans-3.0.0.9-KwAuYyoo9r3GoiDPqmpN5R \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-devel-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-monad-logger"

inherit rpm
