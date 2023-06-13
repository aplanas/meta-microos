SUMMARY = "Haskell easy-file profiling library"
DESCRIPTION = "This package provides the Haskell easy-file profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-easy-file-prof-0.2.3-1.3.aarch64.rpm"
RPM_HASH = "539ab988af36f9650c9c925af449eaced8a16b7727b4ccf03b7d859f0e53b65ae3fe005b2e59f7337a8bf3a25698ae33b0ed4bf777a6f0bc772b69342ab433b2"

RPROVIDES:${PN} += "ghc-easy-file-prof \
ghc-easy-file-prof(aarch-64) \
ghc-prof(easy-file-0.2.3-Bwh7vXkS9r2GpL1fsuKjo4)"

RDEPENDS:${PN} += "ghc-easy-file-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(time-1.12.2) \
ghc-prof(unix-2.7.3)"

inherit rpm
