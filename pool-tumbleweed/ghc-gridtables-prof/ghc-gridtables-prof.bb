SUMMARY = "Haskell gridtables profiling library"
DESCRIPTION = "This package provides the Haskell gridtables profiling library."
LICENSE = "MIT"

PV = "0.1.0.0"

RPM_NAME = "ghc-gridtables-prof-0.1.0.0-1.2.aarch64.rpm"
RPM_HASH = "316130821fb283a48de28eddf8abb58aaf793ce7effd9bf10959e2e38f5b2baea67f50ae4abbfb28c190769de051f81800ab48fe83948ce4726ac5b11bac1e8a"

RPROVIDES:${PN} += "ghc-gridtables-prof \
ghc-gridtables-prof(aarch-64) \
ghc-prof(gridtables-0.1.0.0-I8M3kz7LaeTJ8iEjDWUjrS)"

RDEPENDS:${PN} += "ghc-gridtables-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(text-2.0.2)"

inherit rpm
