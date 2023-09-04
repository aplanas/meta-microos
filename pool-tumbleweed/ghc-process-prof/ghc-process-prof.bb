SUMMARY = "Haskell process profiling library"
DESCRIPTION = "This package provides the Haskell process profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.17.0"

RPM_NAME = "ghc-process-prof-1.6.17.0-1.1.aarch64.rpm"
RPM_HASH = "eadebd69fdbfed4c9f5f36d0ed5fe48dcb4e4b1257d8426dc6eee6492d9ee21e7f985a2c5badd11639b28809438d2ab07479cc841764c778d9ada339c111e974"

RPROVIDES:${PN} += "ghc-process-prof \
ghc-prof-process-1.6.17.0"

RDEPENDS:${PN} += "ghc-process-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-unix-2.7.3"

inherit rpm
