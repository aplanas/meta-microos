SUMMARY = "Haskell haskeline library development files"
DESCRIPTION = "This package provides the Haskell haskeline library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "ghc-haskeline-devel-0.8.2-3.2.aarch64.rpm"
RPM_HASH = "1aeb9e14b32d81fb8891048748866b9f44b1345f6ace335c903ad4d72920d4190128d6a81283423b93beb9a619e44813d5fb5201bc7dc0cf3e9e80eb5f761537"

RPROVIDES:${PN} += "ghc-devel-haskeline-0.8.2 \
ghc-haskeline-devel \
ghc-haskeline-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.16.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-terminfo-0.4.1.5 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-haskeline"

inherit rpm
