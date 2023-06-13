SUMMARY = "Haskell basement profiling library"
DESCRIPTION = "This package provides the Haskell basement profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.15"

RPM_NAME = "ghc-basement-prof-0.0.15-2.3.aarch64.rpm"
RPM_HASH = "62694d30340272cfcff305f34f7a5f9af8092512752f12287838ca079669fdb4a99ccf349017458d89384c77d1775f1fdb6fc67f5e8d3c4cd6452b9fcf4a01f9"

RPROVIDES:${PN} += "ghc-basement-prof \
ghc-basement-prof(aarch-64) \
ghc-prof(basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S)"

RDEPENDS:${PN} += "ghc-basement-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(ghc-prim-0.9.0)"

inherit rpm
