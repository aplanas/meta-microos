SUMMARY = "Haskell array profiling library"
DESCRIPTION = "This package provides the Haskell array profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-prof-0.5.4.0-1.1.aarch64.rpm"
RPM_HASH = "a1a90091d856277b7134c84cac838f0a8bc0348a9f48e567f0c3e5ced65192a0017b8daa614252e5ba9afa1d71e16a486a3d1a58c757e12baad30072fafef15b"

RPROVIDES:${PN} += "ghc-array-prof \
ghc-prof-array-0.5.4.0"

RDEPENDS:${PN} += "ghc-array-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
