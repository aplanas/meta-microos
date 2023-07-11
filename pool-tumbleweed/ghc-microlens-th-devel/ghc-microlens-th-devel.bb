SUMMARY = "Haskell microlens-th library development files"
DESCRIPTION = "This package provides the Haskell microlens-th library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.13"

RPM_NAME = "ghc-microlens-th-devel-0.4.3.13-1.1.aarch64.rpm"
RPM_HASH = "5a62c2a705013cc2a486e7b85409cb6ab0c621e33ca008674d220d9818663fcdf0545b8c1ce4a5a94b4f89306d8498e4b38228363635eb2d036fe9d85bc976d7"

RPROVIDES:${PN} += "ghc-devel-microlens-th-0.4.3.13-4M5tTOX0ioLGTMiKBp6v2C \
ghc-microlens-th-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-devel-transformers-0.5.6.2 \
ghc-microlens-th"

inherit rpm
