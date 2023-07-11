SUMMARY = "Haskell cpphs library development files"
DESCRIPTION = "This package provides the Haskell cpphs library development files."
LICENSE = "LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-devel-1.20.9.1-5.6.aarch64.rpm"
RPM_HASH = "85e74e9ba587a13480f7f33f6d381151a2ca7ddb6e840e5869390eb79fae0f2e477c43bff598fe66a9c4cef487a7cc8b0b1d8fdd478aa3155d19ab4cd7236ad4"

RPROVIDES:${PN} += "ghc-cpphs-devel \
ghc-devel-cpphs-1.20.9.1-FT5N79IhkR98KU1k959mgj"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cpphs \
ghc-devel-base-4.17.1.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-polyparse-1.13-E8FdqtcSqxM3P2njDFrYm8 \
ghc-devel-time-1.12.2"

inherit rpm
