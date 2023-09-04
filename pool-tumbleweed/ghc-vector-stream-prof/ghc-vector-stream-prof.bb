SUMMARY = "Haskell vector-stream profiling library"
DESCRIPTION = "This package provides the Haskell vector-stream profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-vector-stream-prof-0.1.0.0-3.1.aarch64.rpm"
RPM_HASH = "a32b33cbe206cbf2a86eeeb68d2f64dd5485aa1ba0eed5bae575917feb9af56ef5938c9aa77da7f7d12d5c7a778fab2a2e6e0f56bd2838a310f4ff135850fa4f"

RPROVIDES:${PN} += "ghc-prof-vector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB \
ghc-vector-stream-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-vector-stream-devel"

inherit rpm
