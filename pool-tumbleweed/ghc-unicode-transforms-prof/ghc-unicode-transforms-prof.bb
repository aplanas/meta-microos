SUMMARY = "Haskell unicode-transforms profiling library"
DESCRIPTION = "This package provides the Haskell unicode-transforms profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-prof-0.4.0.1-4.6.aarch64.rpm"
RPM_HASH = "09d1d3d88cdd66ac6ccb5f7db38373cbdf9861f1405c6dc5be193b9306d4cfa3490439ce67be5a11ea0953b07bac5cdbf139eb14ec34ce4836cee7ff06a48ae8"

RPROVIDES:${PN} += "ghc-prof-unicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO \
ghc-unicode-transforms-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-text-2.0.2 \
ghc-prof-unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO \
ghc-unicode-transforms-devel"

inherit rpm
