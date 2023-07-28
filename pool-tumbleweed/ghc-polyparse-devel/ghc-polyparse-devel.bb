SUMMARY = "Haskell polyparse library development files"
DESCRIPTION = "This package provides the Haskell polyparse library development files."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-devel-1.13-11.1.aarch64.rpm"
RPM_HASH = "fdcfe4e6e95806a65d387c61d8a3fb6e10a77121c16e4c4b0c1e0a9f28a681c6d0bec7ef9e516b06499f3eb365c2fa0c16af0680696b4ae17d5b9f604f0c2dde"

RPROVIDES:${PN} += "ghc-devel-polyparse-1.13-E8FdqtcSqxM3P2njDFrYm8 \
ghc-polyparse-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-text-2.0.2 \
ghc-polyparse"

inherit rpm
