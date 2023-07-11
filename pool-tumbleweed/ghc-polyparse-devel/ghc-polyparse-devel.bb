SUMMARY = "Haskell polyparse library development files"
DESCRIPTION = "This package provides the Haskell polyparse library development files."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-devel-1.13-10.6.aarch64.rpm"
RPM_HASH = "038e5db890afc040c5c4ccc04c38ca9a0cd1fb7eba25c7ce9efbd06d9c0b062c912232af81ea085698c6716f948b1e6fc7fe46e7cbcce4918099783914c7aec1"

RPROVIDES:${PN} += "ghc-devel-polyparse-1.13-E8FdqtcSqxM3P2njDFrYm8 \
ghc-polyparse-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-text-2.0.2 \
ghc-polyparse"

inherit rpm
