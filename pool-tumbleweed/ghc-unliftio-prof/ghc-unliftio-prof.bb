SUMMARY = "Haskell unliftio profiling library"
DESCRIPTION = "This package provides the Haskell unliftio profiling library."
LICENSE = "MIT"

PV = "0.2.24.0"

RPM_NAME = "ghc-unliftio-prof-0.2.24.0-1.3.aarch64.rpm"
RPM_HASH = "f08108e5e52dd2f6b63f0efb4bab8acce437d8be6bd56bd81400a8945028add761b9d4c1ff1ee5e177a963d4bd8e6697afbecc48a80160a7a8630890b52c9f90"

RPROVIDES:${PN} += "ghc-prof-unliftio-0.2.24.0-Dgc3Qshya29BgIaWsfBy4D \
ghc-unliftio-prof"

RDEPENDS:${PN} += "ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-safe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD \
ghc-prof-stm-2.5.1.0 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-unliftio-devel"

inherit rpm
