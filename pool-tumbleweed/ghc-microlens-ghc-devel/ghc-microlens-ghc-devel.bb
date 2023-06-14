SUMMARY = "Haskell microlens-ghc library development files"
DESCRIPTION = "This package provides the Haskell microlens-ghc library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.14.1"

RPM_NAME = "ghc-microlens-ghc-devel-0.4.14.1-2.2.aarch64.rpm"
RPM_HASH = "5416cd35849debc8037952f8a869dd048574ca05c4dd34a24e59e025d9678e6baa0ae39890078abae14cbbf0deb866b0fc23c83202987abeef69bd2bc2fa975f"

RPROVIDES:${PN} += "ghc-devel-microlens-ghc-0.4.14.1-4Q8SZXKkgj872LFERorIGB \
ghc-microlens-ghc-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-devel-transformers-0.5.6.2 \
ghc-microlens-ghc"

inherit rpm
