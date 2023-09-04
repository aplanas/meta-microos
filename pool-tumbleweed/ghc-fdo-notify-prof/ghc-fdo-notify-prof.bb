SUMMARY = "Haskell fdo-notify profiling library"
DESCRIPTION = "This package provides the Haskell fdo-notify profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-prof-0.3.1-4.9.aarch64.rpm"
RPM_HASH = "3b04bc8c37434a41ca00082a2f0348da4df95a4c663ba899ff0ebd01fa292ce9705f29dbd751ad495338c20de68525d4b301ffcfe6f6019646d7fac4a5c29d3a"

RPROVIDES:${PN} += "ghc-fdo-notify-prof \
ghc-prof-fdo-notify-0.3.1-LNbhlfz8W8WFAdKkUx9okE"

RDEPENDS:${PN} += "ghc-fdo-notify-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-dbus-1.2.29-AAIySIFW0zz7mxLdRwt0V6"

inherit rpm
