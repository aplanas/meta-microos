SUMMARY = "Haskell iwlib library development files"
DESCRIPTION = "This package provides the Haskell iwlib library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-devel-0.1.2-2.3.aarch64.rpm"
RPM_HASH = "5ce42b349cedad390d2778282124fd0151d15bfc1d956ae74c8c0c6288cad68e0019282a2c2e823aeb3c2f8d759ecbe526acf3006da65fa870c1b9bbb9d124d2"

RPROVIDES:${PN} += "ghc-devel-iwlib-0.1.2-DBPHxQHnFovIGpbAOJfyp4 \
ghc-iwlib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-iwlib \
libiw-devel"

inherit rpm
