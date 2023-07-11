SUMMARY = "Haskell terminal-size profiling library"
DESCRIPTION = "This package provides the Haskell terminal-size profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-prof-0.3.4-1.3.aarch64.rpm"
RPM_HASH = "36ebad4fde6c7f396d55afca67afa83536bafcc1461c6f75153e1dbc4e1fea022552ebb12129afdc57ca111ea52c8094ea27a72279fa8b27575a8d55a1786b9d"

RPROVIDES:${PN} += "ghc-prof-terminal-size-0.3.4-1tPFLsRvnmSGNryq4PMCAd \
ghc-terminal-size-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-terminal-size-devel"

inherit rpm
