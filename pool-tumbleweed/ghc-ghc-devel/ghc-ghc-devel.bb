SUMMARY = "Haskell ghc library development files"
DESCRIPTION = "This package provides the Haskell ghc library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-devel-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "05faa9221d00e6f6439d288928c13203317b1945b7b993218d9df1d58001a21496d9e147361924fde89b25ea55abe785f3043f29b22d5d4cb6c219823b674e34"

RPROVIDES:${PN} += "ghc-devel-ghc-9.4.5 \
ghc-ghc-devel \
ghc-ghc-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-boot-9.4.5 \
ghc-devel-ghc-heap-9.4.5 \
ghc-devel-ghci-9.4.5 \
ghc-devel-hpc-0.6.1.0 \
ghc-devel-process-1.6.16.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-terminfo-0.4.1.5 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-ghc"

inherit rpm
