SUMMARY = "A library for import of StarOffice documents"
DESCRIPTION = "libstaroffice is a library for import of StarOffice documents."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-devel-0.0.7-3.10.aarch64.rpm"
RPM_HASH = "b43246305b255dc19f0387a5598efb2ac590b480b1e1d2b3ba703dbf42ba36936b61789aca1cca84dfe6305a3bdbcb370da9afd31dc8f618c0cda0b05bb1867c"

RPROVIDES:${PN} += "libstaroffice-devel \
pkgconfig-libstaroffice-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstaroffice-0-0-0 \
libstdc++-devel \
pkgconfig-librevenge-0.0"

inherit rpm
