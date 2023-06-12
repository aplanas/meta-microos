SUMMARY = "Haskell base library development files"
DESCRIPTION = "This package provides the Haskell base library development files."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-devel-4.17.1.0-3.1.aarch64.rpm"
RPM_HASH = "b0346b3696fdf195a02bdcaba86f90d27d60def3f78086c18c2f5672f04d321e94332806991ed3f36e014808251d32d2871d3001d9d8964ecab7d564bb8f12e2"

RPROVIDES:${PN} += "ghc-base-devel \
ghc-base-devel(aarch-64) \
ghc-base-static \
ghc-base-static(aarch-64) \
ghc-devel(base-4.17.1.0) \
ghc-devel(ghc-bignum-1.3) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(integer-gmp-1.1) \
ghc-devel(rts-1.0.2) \
ghc-devel(system-cxx-std-lib-1.0)"
RDEPENDS:${PN} += "ghc-base(aarch-64) \
ghc-compiler \
gmp-devel \
libdw-devel \
libelf-devel \
libffi-devel \
libnuma-devel"

inherit rpm
