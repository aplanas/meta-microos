SUMMARY = "Haskell unix library development files"
DESCRIPTION = "This package provides the Haskell unix library development files."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-devel-2.7.3-3.2.aarch64.rpm"
RPM_HASH = "19e0b38e9b8d46477e65619484f77048673725e8af0175f20c12cb88027f1c40ed739b94a02fc21c612a497f7b9508d266bb467d74441bec58bbf1fad150930f"

RPROVIDES:${PN} += "ghc-devel-unix-2.7.3 \
ghc-unix-devel \
ghc-unix-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-time-1.12.2 \
ghc-unix"

inherit rpm
