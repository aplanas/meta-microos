SUMMARY = "Haskell terminal-size profiling library"
DESCRIPTION = "This package provides the Haskell terminal-size profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-prof-0.3.4-1.2.aarch64.rpm"
RPM_HASH = "cd9a5756cf37a5114acf821aa2b5043352f35b75df575ad7eeea97c6728a87ef3b45cece5de22b08d1c09c9fd3784164bcd25c7773280318472138b09ac27b9e"

RPROVIDES:${PN} += "ghc-prof(terminal-size-0.3.4-1tPFLsRvnmSGNryq4PMCAd) \
ghc-terminal-size-prof \
ghc-terminal-size-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-terminal-size-devel"

inherit rpm
