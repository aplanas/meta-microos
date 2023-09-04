SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "This package includes the synctex development files. \
The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "texlive-synctex-devel-1.21-93.2.aarch64.rpm"
RPM_HASH = "11683cb5df2e1c400482143281ef9c5b2ee5ce335a8627fe8206827876eed0bbf5650ac63433394b22c49dbd3487cca95e0fb860f3fd56a02dff840995a15196"

RPROVIDES:${PN} += "pkgconfig-synctex \
texlive-synctex-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsynctex2 \
pkgconfig-zlib"

inherit rpm
