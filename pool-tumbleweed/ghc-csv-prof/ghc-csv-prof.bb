SUMMARY = "Haskell csv profiling library"
DESCRIPTION = "This package provides the Haskell csv profiling library."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-prof-0.1.2-4.2.aarch64.rpm"
RPM_HASH = "f4502a234d85aa543cd6bc4010cab053ddd9dca7a0b3e0d6e0bf994f22199661df9fab0ba054b941313d40252e304a6b861189adee8188f4a69534082e35581f"

RPROVIDES:${PN} += "ghc-csv-prof \
ghc-csv-prof(aarch-64) \
ghc-prof(csv-0.1.2-LKioaw43aTAAAKpIk04xxN)"
RDEPENDS:${PN} += "ghc-csv-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(parsec-3.1.16.1)"

inherit rpm
