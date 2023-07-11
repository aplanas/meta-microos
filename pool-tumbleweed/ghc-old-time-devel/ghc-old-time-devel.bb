SUMMARY = "Haskell old-time library development files"
DESCRIPTION = "This package provides the Haskell old-time library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-devel-1.1.0.3-13.3.aarch64.rpm"
RPM_HASH = "f529f4df42cc02c92216d507c2920f625a8da6929361e5969eafafe2aae8c2ed986fce463ea4be44804286d6b788f28e32835418f3444415bf38ae5fdffb46f4"

RPROVIDES:${PN} += "ghc-devel-old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1 \
ghc-old-time-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR \
ghc-old-time"

inherit rpm
