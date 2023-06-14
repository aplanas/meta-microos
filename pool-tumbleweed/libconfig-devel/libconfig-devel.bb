SUMMARY = "C bindings development files for libconfig"
DESCRIPTION = "libconfig is a library for manipulating structured configuration \
files. The supported file format is more compact and more readable \
than XML. Unlike XML, it is type-aware, so it is not necessary to do \
string parsing in application code. \
 \
This package contains the C bindings development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.3"

RPM_NAME = "libconfig-devel-1.7.3-1.8.aarch64.rpm"
RPM_HASH = "936768d0095d662fb6633f89ec1079d9219d177095af17c8b6cf5980a3b16678baae0f68a579c4e33d9e6b14f7dc9acbbbc8f0e4b1c778666d01e7481e28d27e"

RPROVIDES:${PN} += "libconfig-devel \
pkgconfig-libconfig"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libconfig11"

inherit rpm
