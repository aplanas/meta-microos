SUMMARY = "Haskell SafeSemaphore library development files"
DESCRIPTION = "This package provides the Haskell SafeSemaphore library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-devel-0.10.1-5.6.aarch64.rpm"
RPM_HASH = "f9582218561e06838569c29eedbe7b0797830fa8007befd13713528a6d9821d63d1ca6179779f08b63e04888bdde8d545c36eb1598bf2ab4f8bb7fe53443a46a"

RPROVIDES:${PN} += "ghc-SafeSemaphore-devel \
ghc-devel-SafeSemaphore-0.10.1-4RgR0Mf1NXcDYTDfcuJnia"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-SafeSemaphore \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-stm-2.5.1.0"

inherit rpm
