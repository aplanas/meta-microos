SUMMARY = "Haskell unliftio library development files"
DESCRIPTION = "This package provides the Haskell unliftio library development files."
LICENSE = "MIT"

PV = "0.2.25.0"

RPM_NAME = "ghc-unliftio-devel-0.2.25.0-1.4.aarch64.rpm"
RPM_HASH = "4b096b760f27eb66ef0c983293cbb6f0e6e483429db0044f754c2cd54aa2b3b9843e6571cffffc1450c0e407194a42bded19fa55b99818b8bf1d1d6f2e8fce6f"

RPROVIDES:${PN} += "ghc-devel-unliftio-0.2.25.0-DN1mY49M6dHDqA19Vm4lY3 \
ghc-unliftio-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.16.0 \
ghc-devel-safe-exceptions-0.1.7.4-8XVKrMBchTjCLhdcvBwBNb \
ghc-devel-stm-2.5.1.0 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-unliftio"

inherit rpm
