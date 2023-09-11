SUMMARY = "Haskell polyparse library development files"
DESCRIPTION = "This package provides the Haskell polyparse library development files."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-devel-1.13-13.1.aarch64.rpm"
RPM_HASH = "94e0a0fc74ee3e0da004ccdafd6e1718dbbb48a3f4cb641b88f9f5ddd48ac2310608ff5214cd296d252c75130dfed89f1d49e83744a7f962155d72a9fbe725f9"

RPROVIDES:${PN} += "ghc-devel-polyparse-1.13-BLB26XAC1GDzZMBJpPaUe \
ghc-polyparse-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-text-2.0.2 \
ghc-polyparse"

inherit rpm
