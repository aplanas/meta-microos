SUMMARY = "Haskell HsYAML profiling library"
DESCRIPTION = "This package provides the Haskell HsYAML profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-prof-0.2.1.1-5.3.aarch64.rpm"
RPM_HASH = "58aa772473db0edc26b5793126463902f473f6729fdf5f177fd0840138661f379031497b852ee8cc198df7bdba48983af9e2218f63b41272078935bab1f8300e"

RPROVIDES:${PN} += "ghc-HsYAML-prof \
ghc-prof-HsYAML-0.2.1.1-LCJxHEstqYgA5FP8nPmMDQ"

RDEPENDS:${PN} += "ghc-HsYAML-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
