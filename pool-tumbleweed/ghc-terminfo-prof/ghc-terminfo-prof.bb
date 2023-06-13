SUMMARY = "Haskell terminfo profiling library"
DESCRIPTION = "This package provides the Haskell terminfo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-prof-0.4.1.5-3.1.aarch64.rpm"
RPM_HASH = "c89f8f754ae97b85b47321859d3cf1556699e590148c40f0c51e4597ff76cb421c10e63491bf4a129c3ffd213f3fce153f90ae11070249a6b4cbc7d6cbc3eb00"

RPROVIDES:${PN} += "ghc-prof(terminfo-0.4.1.5) \
ghc-terminfo-prof \
ghc-terminfo-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-terminfo-devel(aarch-64)"

inherit rpm
