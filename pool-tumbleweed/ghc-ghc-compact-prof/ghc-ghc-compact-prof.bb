SUMMARY = "Haskell ghc-compact profiling library"
DESCRIPTION = "This package provides the Haskell ghc-compact profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-prof-0.1.0.0-1.1.aarch64.rpm"
RPM_HASH = "91eb9f635d8e159f9667ea40368c1dc2a33b62f33701591140bf1a5f68030d54917b20b454f84549645f89acbf850c30761fb9d0081b1a45e5f1895c0c999c5c"

RPROVIDES:${PN} += "ghc-ghc-compact-prof \
ghc-prof-ghc-compact-0.1.0.0"

RDEPENDS:${PN} += "ghc-ghc-compact-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-ghc-prim-0.9.1"

inherit rpm
