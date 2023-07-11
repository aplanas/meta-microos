SUMMARY = "Haskell process library development files"
DESCRIPTION = "This package provides the Haskell process library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.16.0"

RPM_NAME = "ghc-process-devel-1.6.16.0-3.2.aarch64.rpm"
RPM_HASH = "e25507fd3945a44f5b75e01b8d5d6223c7c0895ce171c1a3ea3a7964e46fc39a3ef30a99dcf96e10715760a031e37046888c66d12b29d355b7bc0be084da8b7a"

RPROVIDES:${PN} += "ghc-devel-process-1.6.16.0 \
ghc-process-devel \
ghc-process-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-unix-2.7.3 \
ghc-process"

inherit rpm
