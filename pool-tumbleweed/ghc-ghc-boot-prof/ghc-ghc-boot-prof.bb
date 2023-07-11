SUMMARY = "Haskell ghc-boot profiling library"
DESCRIPTION = "This package provides the Haskell ghc-boot profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-prof-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "d4d162feab887f91a02896b44a0cf5c366d4cbad3d17a3d08c92af4b99c189ac7ee5c6f90958456c30ebb60890f6e1d84c0804d89703ba8ffe3a00d87fb8fe0b"

RPROVIDES:${PN} += "ghc-ghc-boot-prof \
ghc-prof-ghc-boot-9.4.5"

RDEPENDS:${PN} += "ghc-ghc-boot-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-boot-th-9.4.5 \
ghc-prof-unix-2.7.3"

inherit rpm
