SUMMARY = "Haskell unliftio profiling library"
DESCRIPTION = "This package provides the Haskell unliftio profiling library."
LICENSE = "MIT"

PV = "0.2.25.0"

RPM_NAME = "ghc-unliftio-prof-0.2.25.0-1.7.aarch64.rpm"
RPM_HASH = "33be41a6a1e2d8469cd66ab59cb410e960503c25fc3c9a732a71cd2e4bd4eb380d6199fb924c3fbf915165e00c6df4c7cc475cc8224f7c43688b3e29e0cf29a3"

RPROVIDES:${PN} += "ghc-prof-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-unliftio-prof"

RDEPENDS:${PN} += "ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.17.0 \
ghc-prof-safe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r \
ghc-prof-stm-2.5.1.0 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-unliftio-devel"

inherit rpm
