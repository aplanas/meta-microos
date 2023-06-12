SUMMARY = "Headers for djvulibre libraries"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the development files."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.28"

RPM_NAME = "libdjvulibre-devel-3.5.28-5.1.aarch64.rpm"
RPM_HASH = "9c39f9a5a10b39a866723e131592ae05f730547a5895f339ac2896bac0bcb50d939dc9d64e095afe38b0c6e57cdde9918b7707e41c6e59ca81dffbc05ba4838b"

RPROVIDES:${PN} += "libdjvulibre-devel \
libdjvulibre-devel(aarch-64) \
pkgconfig(ddjvuapi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdjvulibre21"

inherit rpm
