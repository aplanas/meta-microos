SUMMARY = "Guile bindings to zlib"
DESCRIPTION = "This package provides Guile bindings to zlib, a data lossless date-coompression \
library."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.0"

RPM_NAME = "guile-zlib-0.1.0-1.8.aarch64.rpm"
RPM_HASH = "0988e85eb667ed7414d4a9e572e713a66ca8d5cd949e4cbeaafb3651ee25d133b3535a1108f849d99ecb1fa44d6d91be38688e41089c6c459db6cdea9099b802"

RPROVIDES:${PN} += "guile-zlib \
guile-zlib(aarch-64)"

RDEPENDS:${PN} += "guile \
zlib-devel"

inherit rpm
