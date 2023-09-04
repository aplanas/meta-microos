SUMMARY = "Haskell typed-process profiling library"
DESCRIPTION = "This package provides the Haskell typed-process profiling library."
LICENSE = "MIT"

PV = "0.2.11.0"

RPM_NAME = "ghc-typed-process-prof-0.2.11.0-1.9.aarch64.rpm"
RPM_HASH = "0c4d3b4b68afa5df61a3a356b06db0b141e6b6bf1f27fb5a42779959b8df3866a666f716041ce809a8d93d0b1d9152f557278b63c111124d2427e9dafd22b46a"

RPROVIDES:${PN} += "ghc-prof-typed-process-0.2.11.0-D02VU1fccqSD0M6BP6Pfz9 \
ghc-typed-process-prof"

RDEPENDS:${PN} += "ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-process-1.6.17.0 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-typed-process-devel"

inherit rpm
