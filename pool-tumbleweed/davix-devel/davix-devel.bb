SUMMARY = "Headers and sources for developing software using davix"
DESCRIPTION = "This package provides the headers and sources needed for developing \
applications using davix."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "davix-devel-0.8.4-1.4.aarch64.rpm"
RPM_HASH = "a9b224378c5e160bc39bf0a86fca5727e65c2d656d281271f8b5a0b7c4df07b97f4666278ffaa924ca12bb7c7d367bde058fc3deb8f991bdcbc2c6abb1b04655"

RPROVIDES:${PN} += "davix-devel \
pkgconfig-davix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdavix0"

inherit rpm
