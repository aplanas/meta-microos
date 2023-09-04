SUMMARY = "Haskell haskeline profiling library"
DESCRIPTION = "This package provides the Haskell haskeline profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "ghc-haskeline-prof-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "14328a884f8e8a9dfbec482a8d89e6b5e4e62bd1cbf679364df2c011416b0ad6139c0250f45183b8caf7e946cb82a9f54ea8acd174c93ee855a3683a922faeda"

RPROVIDES:${PN} += "ghc-haskeline-prof \
ghc-prof-haskeline-0.8.2"

RDEPENDS:${PN} += "ghc-haskeline-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.17.0 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-terminfo-0.4.1.5 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm
