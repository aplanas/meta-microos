SUMMARY = "Development files for glyr, a music metadata search engine"
DESCRIPTION = "Glyr development files."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "glyr-devel-1.0.10-3.9.aarch64.rpm"
RPM_HASH = "80a0c40d9d12ecc9b7845e6a4033b7c1d79bf0dde1d688146308308ef1a84c64ff8407b3370bbffa9d55bbc181323097f984353b281d25b412e58b00fd62e5d8"

RPROVIDES:${PN} += "glyr-devel \
glyr-devel(aarch-64) \
libglyr-devel \
pkgconfig(libglyr)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglyr1 \
pkgconfig(sqlite3)"

inherit rpm
