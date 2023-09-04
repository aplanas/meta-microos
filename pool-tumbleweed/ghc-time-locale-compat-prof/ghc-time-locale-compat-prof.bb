SUMMARY = "Haskell time-locale-compat profiling library"
DESCRIPTION = "This package provides the Haskell time-locale-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-prof-0.1.1.5-7.3.aarch64.rpm"
RPM_HASH = "04dfc0ddf32ad3cccec50b8b824b0d392640a2d001f6ac368b85465d440f06e2ebfeb77d25b00069469ff55f331690cfeb19cc06096228087e6cb482574199c2"

RPROVIDES:${PN} += "ghc-prof-time-locale-compat-0.1.1.5-9kgo2YphD9418bVnFGy98u \
ghc-time-locale-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-time-1.12.2 \
ghc-time-locale-compat-devel"

inherit rpm
