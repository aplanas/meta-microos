SUMMARY = "Haskell Glob library development files"
DESCRIPTION = "This package provides the Haskell Glob library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-devel-0.10.2-3.8.aarch64.rpm"
RPM_HASH = "6bef7ee3431642bbdffab6643b9666fd64748386ca3d1af5aefe007bc6cfb8aae6009c2d33c56aeba8974f7a52dda6b19bd1050e877d0625d80f0da741ff8a6b"

RPROVIDES:${PN} += "ghc-Glob-devel \
ghc-devel-Glob-0.10.2-96NxBWCYICFFsqKvc9eqpc"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-Glob \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-dlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM"

inherit rpm
