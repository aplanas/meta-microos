SUMMARY = "Haskell unliftio profiling library"
DESCRIPTION = "This package provides the Haskell unliftio profiling library."
LICENSE = "MIT"

PV = "0.2.25.0"

RPM_NAME = "ghc-unliftio-prof-0.2.25.0-1.4.aarch64.rpm"
RPM_HASH = "17b575eeab4fcf74234a8e9824fd142f2c13a8ff05cd849d1751f700a551ed77ea80a28aff699e8d32bf250467d6efe48fbcda74b511d5f64a40ed3fa3c3bcf6"

RPROVIDES:${PN} += "ghc-prof-unliftio-0.2.25.0-DN1mY49M6dHDqA19Vm4lY3 \
ghc-unliftio-prof"

RDEPENDS:${PN} += "ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-safe-exceptions-0.1.7.4-8XVKrMBchTjCLhdcvBwBNb \
ghc-prof-stm-2.5.1.0 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-unliftio-devel"

inherit rpm
