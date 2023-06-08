SUMMARY = "Haskell appar profiling library"
DESCRIPTION = "This package provides the Haskell appar profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-prof-0.1.8-4.2.aarch64.rpm"
RPM_HASH = "6b2d860087db59a7c033a438570dbf4c60af4bba32bbe08c9b887a1b79fec6afb9704b45f3050a3d874db084e40ed79d007ee5a5a0a169daf74cdbd6fd4c4912"

RPROVIDES:${PN} += "ghc-appar-prof ghc-appar-prof(aarch-64) ghc-prof(appar-0.1.8-JYpyJYPkUOgKorqU8WSWRv)"
RDEPENDS:${PN} += "ghc-appar-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0)"

inherit rpm
