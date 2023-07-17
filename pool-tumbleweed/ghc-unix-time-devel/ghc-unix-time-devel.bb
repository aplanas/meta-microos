SUMMARY = "Haskell unix-time library development files"
DESCRIPTION = "This package provides the Haskell unix-time library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "ghc-unix-time-devel-0.4.10-1.1.aarch64.rpm"
RPM_HASH = "01656b594b2115e66bfc5459161e45a08979f145d8a62766142260f7ad92c58786e60179330ffe229b060e4971045b623627e56f79d9902f62cff9e6aca765ed"

RPROVIDES:${PN} += "ghc-devel-unix-time-0.4.10-LpZG5YAXe572FFFZnKOLQq \
ghc-unix-time-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1 \
ghc-unix-time"

inherit rpm
