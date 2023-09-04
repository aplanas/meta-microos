SUMMARY = "Haskell lukko profiling library"
DESCRIPTION = "This package provides the Haskell lukko profiling library."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.1.3"

RPM_NAME = "ghc-lukko-prof-0.1.1.3-5.8.aarch64.rpm"
RPM_HASH = "11c1cb243cf8f6e7b0d4504e546a62fba673be580f1099fa6febf2ee2b6519bc9aed528106f6592b83a0ff2854f6dc71c1f98b107b516229a09ecb01a07c15bd"

RPROVIDES:${PN} += "ghc-lukko-prof \
ghc-prof-lukko-0.1.1.3-IWqFfSgydIZCIQyWjUior5"

RDEPENDS:${PN} += "ghc-lukko-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
