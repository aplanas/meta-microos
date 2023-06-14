SUMMARY = "Development Tools for applications which will use the Libjpeg Library"
DESCRIPTION = "The libjpeg-devel package includes the header files and libraries \
necessary for compiling and linking programs which will manipulate JPEG \
files using the libjpeg library."
LICENSE = "BSD-3-Clause"

PV = "62.3.0"

RPM_NAME = "libjpeg62-devel-62.3.0-75.1.aarch64.rpm"
RPM_HASH = "83c8d6362e86fe493fefb273ac1f96b78a03a73ede9362064455e4c2f7a1d19fa817299a9e547762bc80d8f3983b582c043bcdf42f1e0c7b9455abbf89dc5fcb"

RPROVIDES:${PN} += "libjpeg-devel \
libjpeg62-devel \
pkgconfig-libjpeg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg62"

inherit rpm
