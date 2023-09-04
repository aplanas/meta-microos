SUMMARY = "Haskell haskeline library development files"
DESCRIPTION = "This package provides the Haskell haskeline library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "ghc-haskeline-devel-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "1d40805b0ebc22edfe995a1eec6231ca678e0b977ef9ccc5661b6d5718cf00375d4b52fbf5c185170fe2becfd947fe4a63edeed261ec2703b472171c8389c69a"

RPROVIDES:${PN} += "ghc-devel-haskeline-0.8.2 \
ghc-haskeline-devel \
ghc-haskeline-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.17.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-terminfo-0.4.1.5 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-haskeline"

inherit rpm
