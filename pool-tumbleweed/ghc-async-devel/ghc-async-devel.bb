SUMMARY = "Haskell async library development files"
DESCRIPTION = "This package provides the Haskell async library development files."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "ghc-async-devel-2.2.4-4.4.aarch64.rpm"
RPM_HASH = "7479d8f3d9f4f70d0a90025ad3845e20679ff5d39d69ab3a5c2022d507395135f82c77aefe78bb3494241aa2604205c752daeebdbd2e785ed1a402d71bff4d32"

RPROVIDES:${PN} += "ghc-async-devel \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-async \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-stm-2.5.1.0"

inherit rpm
