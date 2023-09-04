SUMMARY = "Haskell setenv library development files"
DESCRIPTION = "This package provides the Haskell setenv library development files."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-devel-0.1.1.3-12.3.aarch64.rpm"
RPM_HASH = "ca9dd5701b13cec8116885ecfe3b73602aa30bc01e3c1d956dec8dedc9478429c8caa585815328e87670f5b1baf94a74a0bcf3e5ebcac66f2af9bcf744379c25"

RPROVIDES:${PN} += "ghc-devel-setenv-0.1.1.3-5X2tG8kGRXiEiTQvekWgx7 \
ghc-setenv-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-unix-2.7.3 \
ghc-setenv"

inherit rpm
