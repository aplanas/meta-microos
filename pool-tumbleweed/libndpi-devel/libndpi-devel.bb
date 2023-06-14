SUMMARY = "Development headers for nNDPI"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. \
 \
This package contains the Development headers for libndpi."
LICENSE = "LGPL-3.0-only"

PV = "4.0"

RPM_NAME = "libndpi-devel-4.0-1.8.aarch64.rpm"
RPM_HASH = "6acd637d2707f49318d3a725f6d21e012cf3049ab058e434ab56d2c1a2dea09c249cba34d77f64f81b71602e45470271a189a912a4de54267fa151b4ef5d9d7e"

RPROVIDES:${PN} += "libndpi-devel \
pkgconfig-libndpi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libndpi4"

inherit rpm
