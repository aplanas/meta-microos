SUMMARY = "Haskell recv profiling library"
DESCRIPTION = "This package provides the Haskell recv profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-recv-prof-0.1.0-1.3.aarch64.rpm"
RPM_HASH = "0505e3f780a14d40ef10017a4def9b171f2fac359321da1749595be0a918c5adb6d40e39946d87c86b75c2d1b17d1dbcecddfc7a63ae4860d95bafa1e2b9a6a6"

RPROVIDES:${PN} += "ghc-prof(recv-0.1.0-4koyrU2GJ4L4fpyKcXLbZR) ghc-recv-prof ghc-recv-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) ghc-recv-devel"

inherit rpm
