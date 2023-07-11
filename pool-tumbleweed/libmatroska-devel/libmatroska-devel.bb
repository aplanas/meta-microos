SUMMARY = "Library to Deal with Matroska Files"
DESCRIPTION = "Libmatroska is a C++ library to parse Matroska files (.mkv and .mka). \
It depends on libebml to work. You only need this package to compile \
your own applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.1"

RPM_NAME = "libmatroska-devel-1.7.1-1.4.aarch64.rpm"
RPM_HASH = "ed195c8c6948bb54427ae4158bac79e517bc9e585251ddecec5ab2d95ce899f6781059725475b03a7f1eb99a0a276008b0553c5b428eebd1d2fad51a28ed003e"

RPROVIDES:${PN} += "cmake-Matroska \
libmatroska-devel \
pkgconfig-libmatroska"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmatroska7 \
pkgconfig-libebml"

inherit rpm
