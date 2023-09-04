SUMMARY = "Haskell polyparse library development files"
DESCRIPTION = "This package provides the Haskell polyparse library development files."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-devel-1.13-12.3.aarch64.rpm"
RPM_HASH = "ec0ba0e6b8441683622456cbfb1417f67fd27b5f46c9ad45900bb86c50a4f3c520eeee477c359719d5ce6d8403ab52d4975bb706e9727935fca9c21de2311d35"

RPROVIDES:${PN} += "ghc-devel-polyparse-1.13-BLB26XAC1GDzZMBJpPaUe \
ghc-polyparse-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-text-2.0.2 \
ghc-polyparse"

inherit rpm
