SUMMARY = "Haskell fdo-notify library development files"
DESCRIPTION = "This package provides the Haskell fdo-notify library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-devel-0.3.1-4.9.aarch64.rpm"
RPM_HASH = "cac42adbf6f15c8de4a296f4cb9e427981fcb9c088f0d12c9da8ab59d7ad8ba6c2c1a58e917eeeda55a27e5482c12d66e715769baf335bd304b29b878bbc4e4e"

RPROVIDES:${PN} += "ghc-devel-fdo-notify-0.3.1-LNbhlfz8W8WFAdKkUx9okE \
ghc-fdo-notify-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-dbus-1.2.29-AAIySIFW0zz7mxLdRwt0V6 \
ghc-fdo-notify"

inherit rpm
