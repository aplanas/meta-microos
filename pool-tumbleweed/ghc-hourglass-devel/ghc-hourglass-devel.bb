SUMMARY = "Haskell hourglass library development files"
DESCRIPTION = "This package provides the Haskell hourglass library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-devel-0.2.12-7.8.aarch64.rpm"
RPM_HASH = "28034aa06969755a4cad0606034da99d6b11647457448a7bfad2c0a8d1f5ba9eecef53dfd15a0d86a4d21b9b1f64edecd8367abe95d0ab4b2f4eb4f3a7571b04"

RPROVIDES:${PN} += "ghc-devel-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho \
ghc-hourglass-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-hourglass"

inherit rpm
