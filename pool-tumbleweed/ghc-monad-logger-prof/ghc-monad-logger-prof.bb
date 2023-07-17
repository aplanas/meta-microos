SUMMARY = "Haskell monad-logger profiling library"
DESCRIPTION = "This package provides the Haskell monad-logger profiling library."
LICENSE = "MIT"

PV = "0.3.40"

RPM_NAME = "ghc-monad-logger-prof-0.3.40-1.4.aarch64.rpm"
RPM_HASH = "02061a53adb38f38117e06be4f9060630227293b00aee2323f8e44429eb4c4044091be9bdc40ce109bce94f5828f8358c0bb475d1d0de2fb271e0cf5839b69da"

RPROVIDES:${PN} += "ghc-monad-logger-prof \
ghc-prof-monad-logger-0.3.40-JON4xqa3KWj1ClCWFJbFYV"

RDEPENDS:${PN} += "ghc-monad-logger-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-fast-logger-3.1.2-FrZhfcoVNTvDFmA3ecjq8Q \
ghc-prof-lifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo \
ghc-prof-monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX \
ghc-prof-monad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9 \
ghc-prof-mtl-2.2.2 \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-stm-2.5.1.0 \
ghc-prof-stm-chans-3.0.0.9-KwAuYyoo9r3GoiDPqmpN5R \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-prof-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj"

inherit rpm
