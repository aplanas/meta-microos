SUMMARY = "Haskell parallel library development files"
DESCRIPTION = "This package provides the Haskell parallel library development files."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-devel-3.2.2.0-12.6.aarch64.rpm"
RPM_HASH = "ca90e0b3b649efc1bbc26dcd628eaa4891c0e9e3d018099c7d5b4a6e6e1484bde65b41d5104513b1a734504ef1038a3201d9cf7c3b48b43723f401f98e81d29d"

RPROVIDES:${PN} += "ghc-devel-parallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr \
ghc-parallel-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-parallel"

inherit rpm
