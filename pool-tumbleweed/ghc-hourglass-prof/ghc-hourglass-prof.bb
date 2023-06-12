SUMMARY = "Haskell hourglass profiling library"
DESCRIPTION = "This package provides the Haskell hourglass profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-prof-0.2.12-7.3.aarch64.rpm"
RPM_HASH = "9c184d357763b9944ec8292edcacb00dcb292461eb46fcb77f52a6ef6f2008dafd83c8afcbe7f8e9e4978458115f472a29e4bb149b0fe82cde9d1b6510af88d5"

RPROVIDES:${PN} += "ghc-hourglass-prof \
ghc-hourglass-prof(aarch-64) \
ghc-prof(hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3)"
RDEPENDS:${PN} += "ghc-hourglass-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0)"

inherit rpm
