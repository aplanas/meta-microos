SUMMARY = "Haskell cpphs library development files"
DESCRIPTION = "This package provides the Haskell cpphs library development files."
LICENSE = "LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-devel-1.20.9.1-5.3.aarch64.rpm"
RPM_HASH = "ee73be9d3d27d56930c2c444c2920bae3b56ddcc36a4b7e336a91a2c11788f0627197e3eaf092f48a91bbfff0f6fa486f47670a6174471148488dbd5e17f644a"

RPROVIDES:${PN} += "ghc-cpphs-devel ghc-cpphs-devel(aarch-64) ghc-devel(cpphs-1.20.9.1-FT5N79IhkR98KU1k959mgj)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-cpphs ghc-devel(base-4.17.1.0) ghc-devel(directory-1.3.7.1) ghc-devel(polyparse-1.13-E8FdqtcSqxM3P2njDFrYm8) ghc-devel(time-1.12.2)"

inherit rpm
