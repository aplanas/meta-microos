SUMMARY = "Haskell http-types profiling library"
DESCRIPTION = "This package provides the Haskell http-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "ghc-http-types-prof-0.12.3-6.3.aarch64.rpm"
RPM_HASH = "834be4e0976258c2c6b10f97ae413f9ed00b075cdee6c3f56b2c1f54b5df2a3825f29f5d55a4bf5f00bb5d1aab2a675282961c78f1c2b3dbb7caefde86c23d18"

RPROVIDES:${PN} += "ghc-http-types-prof \
ghc-http-types-prof(aarch-64) \
ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6)"

RDEPENDS:${PN} += "ghc-http-types-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-prof(text-2.0.2)"

inherit rpm
