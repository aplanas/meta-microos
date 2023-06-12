SUMMARY = "Haskell polyparse library development files"
DESCRIPTION = "This package provides the Haskell polyparse library development files."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-devel-1.13-10.3.aarch64.rpm"
RPM_HASH = "48624255f7346de7759f14a6e8ff421019062139a3ea2baa23ebc7fd4fdc26946a278dbdf273a3402f929a3a7907a95153f749b0e6fa87d77e4a68ae5e969ddc"

RPROVIDES:${PN} += "ghc-devel(polyparse-1.13-E8FdqtcSqxM3P2njDFrYm8) \
ghc-polyparse-devel \
ghc-polyparse-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(text-2.0.2) \
ghc-polyparse"

inherit rpm
