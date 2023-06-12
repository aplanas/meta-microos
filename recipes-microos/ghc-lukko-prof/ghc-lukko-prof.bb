SUMMARY = "Haskell lukko profiling library"
DESCRIPTION = "This package provides the Haskell lukko profiling library."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.1.3"

RPM_NAME = "ghc-lukko-prof-0.1.1.3-5.3.aarch64.rpm"
RPM_HASH = "4a5cbccc5897c6e31dacd58c7e3c5dfd916aa542163a4eeda43d5610727b242e896ae5607d3f8040cd83987519de89db7c017382de82392b6ea250dc1aff38bd"

RPROVIDES:${PN} += "ghc-lukko-prof \
ghc-lukko-prof(aarch-64) \
ghc-prof(lukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V)"
RDEPENDS:${PN} += "ghc-lukko-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
