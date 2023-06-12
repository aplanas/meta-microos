SUMMARY = "A library for import of StarOffice documents"
DESCRIPTION = "libstaroffice is a library for import of StarOffice documents."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-devel-0.0.7-3.9.aarch64.rpm"
RPM_HASH = "c170d450faffda23e35d8992f6fd3153c8d650af36f727feb0bcf535e411ffad072d69f26e1818e8d6bd851badd17374ac8ed9422041128a9083aaf98173cfb8"

RPROVIDES:${PN} += "libstaroffice-devel \
libstaroffice-devel(aarch-64) \
pkgconfig(libstaroffice-0.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstaroffice-0_0-0 \
libstdc++-devel \
pkgconfig(librevenge-0.0)"

inherit rpm
