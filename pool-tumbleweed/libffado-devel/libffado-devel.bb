SUMMARY = "Development files for ffado"
DESCRIPTION = "This package supplys the files necessary to develop \
applications that use the FFADO libraries and api."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.7"

RPM_NAME = "libffado-devel-2.4.7-1.1.aarch64.rpm"
RPM_HASH = "db66e2d80bbd4f5c049286e83d78539c6422c67b37db640048762e9ee9b80bb4861ab5d3d7d6ef79d822f884391df38eb52c5870aabcfcd149c29c0ed09cbb65"

RPROVIDES:${PN} += "libffado-devel \
pkgconfig-libffado"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libconfig-devel \
libdbus-c++-devel \
libffado2"

inherit rpm
