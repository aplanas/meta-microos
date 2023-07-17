SUMMARY = "Development files for libfvalue"
DESCRIPTION = "Library to provide generic file value functions for the libyal family of libraries. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfvalue."
LICENSE = "LGPL-3.0-or-later"

PV = "20220120"

RPM_NAME = "libfvalue-devel-20220120-3.7.aarch64.rpm"
RPM_HASH = "49e6cd6c263202c7ae513f2b8ced1efb5f930688ae8aff42a3fef82b7417045ae5a6e7fcb816582123da22cb701dfd22de3eb9127d4bdbd37f9e5df0ac8b4631"

RPROVIDES:${PN} += "libfvalue-devel \
pkgconfig-libfvalue"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfvalue1"

inherit rpm
