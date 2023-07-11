SUMMARY = "Haskell Diff profiling library"
DESCRIPTION = "This package provides the Haskell Diff profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-prof-0.4.1-2.6.aarch64.rpm"
RPM_HASH = "97e887dde25f7aaa8d8d4ca918893eb97e5bf930e168548a69abea8e41c10668ca1784aa2bb93be859257c07f136eb2392404b63647db2637d683ad661e51c6c"

RPROVIDES:${PN} += "ghc-Diff-prof \
ghc-prof-Diff-0.4.1-CiDqeLEcsRQOQjfgZOPVP"

RDEPENDS:${PN} += "ghc-Diff-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-pretty-1.1.3.6"

inherit rpm
