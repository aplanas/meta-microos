SUMMARY = "Haskell safe library development files"
DESCRIPTION = "This package provides the Haskell safe library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.19"

RPM_NAME = "ghc-safe-devel-0.3.19-4.3.aarch64.rpm"
RPM_HASH = "59fc4e7ce67aad1bd5a69f6a902e956bffd15907a5b3fa019bd66845128778c3f54a8f0ed8f64c769246f00c1dd360a17ce44db74351c158cae558828304d2d0"

RPROVIDES:${PN} += "ghc-devel(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) \
ghc-safe-devel \
ghc-safe-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-safe"

inherit rpm
