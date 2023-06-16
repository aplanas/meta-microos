SUMMARY = "Haskell vector-stream library development files"
DESCRIPTION = "This package provides the Haskell vector-stream library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-vector-stream-devel-0.1.0.0-2.2.aarch64.rpm"
RPM_HASH = "8f791b0b6290a798d3a9c901da6744449bdab54c6502c5ca38d611fe699bd4461cc72993ce927c69ab5d35311fbe1c93f1d035f91dd7b49ad852579bc4110061"

RPROVIDES:${PN} += "ghc-devel-vector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s \
ghc-vector-stream-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-vector-stream"

inherit rpm
