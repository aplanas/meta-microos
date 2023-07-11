SUMMARY = "Haskell cpphs profiling library"
DESCRIPTION = "This package provides the Haskell cpphs profiling library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-prof-1.20.9.1-5.6.aarch64.rpm"
RPM_HASH = "2dabb897d5eeac234b816c6a699e2d6e44dfe3ddc18d58cf1071b90b1111742c602d14531ccf2ae7e3873f84dea64e76142e68654c1563f6a5aea9ec11ba0e9f"

RPROVIDES:${PN} += "ghc-cpphs-prof \
ghc-prof-cpphs-1.20.9.1-FT5N79IhkR98KU1k959mgj"

RDEPENDS:${PN} += "ghc-cpphs-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-polyparse-1.13-E8FdqtcSqxM3P2njDFrYm8 \
ghc-prof-time-1.12.2"

inherit rpm
