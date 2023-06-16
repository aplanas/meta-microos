SUMMARY = "Haskell typed-process library development files"
DESCRIPTION = "This package provides the Haskell typed-process library development files."
LICENSE = "MIT"

PV = "0.2.11.0"

RPM_NAME = "ghc-typed-process-devel-0.2.11.0-1.3.aarch64.rpm"
RPM_HASH = "3afa333d8e5ab47aa1d26aaa0b5cfd94c4edad7d7ca75efaf90e5ca9ba1ccb7c757e1bf25f2887fcb3c508d7b95a64005c480d1fc8d648d753f1bdc072c3a24f"

RPROVIDES:${PN} += "ghc-devel-typed-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO \
ghc-typed-process-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-process-1.6.16.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-typed-process"

inherit rpm
