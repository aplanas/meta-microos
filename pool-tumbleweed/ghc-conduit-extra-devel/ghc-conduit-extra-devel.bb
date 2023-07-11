SUMMARY = "Haskell conduit-extra library development files"
DESCRIPTION = "This package provides the Haskell conduit-extra library development files."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "ghc-conduit-extra-devel-1.3.6-2.8.aarch64.rpm"
RPM_HASH = "d9bf0c3c4fd9aed25f25e91b9b3f96a545002d4bbf8d2d14c4ab938594240b5d651bb155c654e9dc0f878413319e00e5f854529a453247406698d30d3cfc10e5"

RPROVIDES:${PN} += "ghc-conduit-extra-devel \
ghc-devel-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-conduit-extra \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-process-1.6.16.0 \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-stm-2.5.1.0 \
ghc-devel-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-typed-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO \
ghc-devel-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj"

inherit rpm
