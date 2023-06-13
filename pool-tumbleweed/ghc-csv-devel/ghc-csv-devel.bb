SUMMARY = "Haskell csv library development files"
DESCRIPTION = "This package provides the Haskell csv library development files."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-devel-0.1.2-4.2.aarch64.rpm"
RPM_HASH = "e1031fe54b892520fa093605c1d3ad763568bdebfec564165680c202b38f3dd5a4428066489178080cae3017f2c2ee44ac11fb147a8599840420f3c48b1bdc91"

RPROVIDES:${PN} += "ghc-csv-devel \
ghc-csv-devel(aarch-64) \
ghc-devel(csv-0.1.2-LKioaw43aTAAAKpIk04xxN)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-csv \
ghc-devel(base-4.17.1.0) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(parsec-3.1.16.1)"

inherit rpm
