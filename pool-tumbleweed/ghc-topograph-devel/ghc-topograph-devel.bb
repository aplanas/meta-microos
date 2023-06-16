SUMMARY = "Haskell topograph library development files"
DESCRIPTION = "This package provides the Haskell topograph library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-devel-1.0.0.2-2.2.aarch64.rpm"
RPM_HASH = "33ed23e067a5ad5adf7a01083d0285e68344332425f7536ec10788d80ccc41801c688bc67f8f6b5ff9e899cba66e5685afac72dbd9177e7d7ad8a0f77ab191ff"

RPROVIDES:${PN} += "ghc-devel-topograph-1.0.0.2-FAmn9lLfwsBEVgB5YGdVHh \
ghc-topograph-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov \
ghc-devel-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-devel-containers-0.6.7 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-topograph"

inherit rpm
