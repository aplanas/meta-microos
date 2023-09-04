SUMMARY = "Haskell OneTuple library development files"
DESCRIPTION = "This package provides the Haskell OneTuple library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-OneTuple-devel-0.4.1.1-1.4.aarch64.rpm"
RPM_HASH = "ca4b6d53f0a9bc758a2f442e23667fbff2403c47b19783b39969af691c54d2b3d0e36b1adf1e73051e3f05a9233bb428afa77323b14a45fec5aa4ab8f30ccbb1"

RPROVIDES:${PN} += "ghc-OneTuple-devel \
ghc-devel-OneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-OneTuple \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-template-haskell-2.19.0.0"

inherit rpm
