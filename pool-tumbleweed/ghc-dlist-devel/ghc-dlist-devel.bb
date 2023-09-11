SUMMARY = "Haskell dlist library development files"
DESCRIPTION = "This package provides the Haskell dlist library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-devel-1.0-4.1.aarch64.rpm"
RPM_HASH = "fa26ae84b291c0fb340f737b1fb2c9581aa3ee2c9c4e6f9391e0abe0089469e07fc1a0f3b47e8bcdf2a522333ebd66919f825ce8c9c435fa269f0c87008ecdd4"

RPROVIDES:${PN} += "ghc-devel-dlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ \
ghc-dlist-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-dlist"

inherit rpm
