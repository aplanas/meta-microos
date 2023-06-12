SUMMARY = "Haskell process profiling library"
DESCRIPTION = "This package provides the Haskell process profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.16.0"

RPM_NAME = "ghc-process-prof-1.6.16.0-3.1.aarch64.rpm"
RPM_HASH = "6f3ff1d6b7462f8459320e4964aadbe63b29f442d98d11422e398932fd07c94977d5da7bfecf902965dd26d7d8c720d0021bdca95cabe7df39415271fd71db7a"

RPROVIDES:${PN} += "ghc-process-prof \
ghc-process-prof(aarch-64) \
ghc-prof(process-1.6.16.0)"
RDEPENDS:${PN} += "ghc-process-devel(aarch-64) \
ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(unix-2.7.3)"

inherit rpm
