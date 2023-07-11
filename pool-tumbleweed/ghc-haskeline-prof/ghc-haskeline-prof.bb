SUMMARY = "Haskell haskeline profiling library"
DESCRIPTION = "This package provides the Haskell haskeline profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "ghc-haskeline-prof-0.8.2-3.2.aarch64.rpm"
RPM_HASH = "d6023f1276e9f5163f9a8d20056318ca3e4e68cf05b667cc748a7281b78d9a2846813340b28fd81e40bc4a5bcb068a59e38831c9d6cbafc3f78c44eb1c05614f"

RPROVIDES:${PN} += "ghc-haskeline-prof \
ghc-prof-haskeline-0.8.2"

RDEPENDS:${PN} += "ghc-haskeline-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-terminfo-0.4.1.5 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm
