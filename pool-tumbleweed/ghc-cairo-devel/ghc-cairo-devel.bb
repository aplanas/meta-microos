SUMMARY = "Haskell cairo library development files"
DESCRIPTION = "This package provides the Haskell cairo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.10.0"

RPM_NAME = "ghc-cairo-devel-0.13.10.0-1.3.aarch64.rpm"
RPM_HASH = "50f46b8549fe51691b70a2a9c8f15206b19658726e44edfa3e46f0f30bbbca65459ea3f55cbe7ebc93a88b1d52b9097e493f2380968580005b24deaf60f6097f"

RPROVIDES:${PN} += "ghc-cairo-devel \
ghc-devel-cairo-0.13.10.0-79KHEyza8Yx2ITjvRp5k2b"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cairo \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
pkgconfig \
pkgconfig-cairo \
pkgconfig-cairo-pdf \
pkgconfig-cairo-ps \
pkgconfig-cairo-svg"

inherit rpm
