SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "This package includes the synctex development files. \
The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "texlive-synctex-devel-1.21-93.1.aarch64.rpm"
RPM_HASH = "18687ea19a997dbf93ecb484dd9f39b6b435615601268bd09cff14309c37ca406deb91418c42ab1fc4447f78bc9fd4385115f6dee1630ccfb8aea004ea5e3b9c"

RPROVIDES:${PN} += "pkgconfig-synctex \
texlive-synctex-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsynctex2 \
pkgconfig-zlib"

inherit rpm
