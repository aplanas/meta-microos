SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "This package includes the synctex development files. \
The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "texlive-synctex-devel-1.21-92.1.aarch64.rpm"
RPM_HASH = "d228f42098907f1e520304a483cc391a2b7571c2ad3dd3ede6b84dbbb83a137a1c3a7d80308fd3608e270b0b14daaa570ca0b5cd4caeaa41583f8407597992ab"

RPROVIDES:${PN} += "pkgconfig-synctex \
texlive-synctex-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsynctex2 \
pkgconfig-zlib"

inherit rpm
