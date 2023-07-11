SUMMARY = "Industrial I/O tools"
DESCRIPTION = "Library for industrial I/O."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "libiio-0.24-1.5.aarch64.rpm"
RPM_HASH = "051b005af285565e594611440543ba64cad147a1f90e5fffd61bd697a5c28484df331c21ec1dc2ad6f64b32e653d9dc99c15ad2e89d8053d347de33031287a39"

RPROVIDES:${PN} += "libiio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiio.so.0 \
systemd"

inherit rpm
