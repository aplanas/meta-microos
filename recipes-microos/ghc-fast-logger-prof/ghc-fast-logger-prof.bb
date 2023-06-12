SUMMARY = "Haskell fast-logger profiling library"
DESCRIPTION = "This package provides the Haskell fast-logger profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-prof-3.1.2-1.3.aarch64.rpm"
RPM_HASH = "987e3875ad840409cd8b243645c80dac0ac1adb3fb783d644e8a70af99b18f349c058b7d9ebc88081fdfcef31e0f8a0cba6df02e1693d3e68b8b7d7d7132826a"

RPROVIDES:${PN} += "ghc-fast-logger-prof \
ghc-fast-logger-prof(aarch-64) \
ghc-prof(fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ)"
RDEPENDS:${PN} += "ghc-fast-logger-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(easy-file-0.2.3-Bwh7vXkS9r2GpL1fsuKjo4) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(text-2.0.2) \
ghc-prof(unix-compat-0.6-79KxxZMmklx25hsmeEnenN) \
ghc-prof(unix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0)"

inherit rpm
