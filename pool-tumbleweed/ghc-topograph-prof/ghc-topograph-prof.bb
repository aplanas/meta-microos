SUMMARY = "Haskell topograph profiling library"
DESCRIPTION = "This package provides the Haskell topograph profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-prof-1.0.0.2-2.2.aarch64.rpm"
RPM_HASH = "1d535e60650a1e7854eb49c3fa1eb51c729f26c70d8e69a1bffc6e4844a5f22af31b25fe0e71e79a469dca7e416a6d59a123adad9d69550fc0d760b39012ff41"

RPROVIDES:${PN} += "ghc-prof(topograph-1.0.0.2-FAmn9lLfwsBEVgB5YGdVHh) \
ghc-topograph-prof \
ghc-topograph-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov) \
ghc-prof(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8) \
ghc-prof(containers-0.6.7) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-topograph-devel"

inherit rpm
