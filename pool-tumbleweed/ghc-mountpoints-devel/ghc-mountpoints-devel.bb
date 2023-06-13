SUMMARY = "Haskell mountpoints library development files"
DESCRIPTION = "This package provides the Haskell mountpoints library development files."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-devel-1.0.2-4.2.aarch64.rpm"
RPM_HASH = "7b91a26c7194f73816517c99ff7dc2cb8e864f7acbfaa1b7d3a077c54b1b238a92748bf1d8d8a6108dc773edb93b05dbea9591dc42c246c3248e8a5326272f04"

RPROVIDES:${PN} += "ghc-devel(mountpoints-1.0.2-1s316lA2PKMJiFY8pZCQYD) \
ghc-mountpoints-devel \
ghc-mountpoints-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-mountpoints"

inherit rpm
