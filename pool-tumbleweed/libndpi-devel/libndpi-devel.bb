SUMMARY = "Development headers for nNDPI"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. \
 \
This package contains the Development headers for libndpi."
LICENSE = "LGPL-3.0-only"

PV = "4.0"

RPM_NAME = "libndpi-devel-4.0-1.9.aarch64.rpm"
RPM_HASH = "b70b573ff4fef728f58ff27aee06ac943c3c1992b2c1e64afee76989958a185bc3f7f164a2ee82113d2a1407042f311a92b3539e9840af7332965a5e155f5bd3"

RPROVIDES:${PN} += "libndpi-devel \
pkgconfig-libndpi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libndpi4"

inherit rpm
