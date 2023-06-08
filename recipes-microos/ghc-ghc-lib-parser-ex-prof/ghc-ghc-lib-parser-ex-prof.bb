SUMMARY = "Haskell ghc-lib-parser-ex profiling library"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-prof-9.4.0.0-1.3.aarch64.rpm"
RPM_HASH = "237c01ceeb8e05beb8d5bc7357d694f91fe400975cbb24bfffbe2801b5ed1d844480009a37b2dbaf95630ad86ed1bfaa157e8bd281e50cdbf151e92f4cfa4f14"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex-prof ghc-ghc-lib-parser-ex-prof(aarch-64) ghc-prof(ghc-lib-parser-ex-9.4.0.0-70SEjDlvh6sIQjB4r4CbU7)"
RDEPENDS:${PN} += "ghc-ghc-lib-parser-ex-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(ghc-lib-parser-9.4.4.20221225-IYLH4ajMYTmJphnJAgaapb) ghc-prof(uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN)"

inherit rpm
