SUMMARY = "Development files for libfcache"
DESCRIPTION = "Library to provide generic file data cache functions for the libyal family of libraries. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfcache."
LICENSE = "LGPL-3.0-or-later"

PV = "20230115"

RPM_NAME = "libfcache-devel-20230115-1.2.aarch64.rpm"
RPM_HASH = "dc97643c589b76f7d9a77799a82577b80b36e8d7383bf8ba963778ab852027929806a367735ffd06e9d56c37c80a1fc139eba9b390b488fbf423aa56ba73ed4c"

RPROVIDES:${PN} += "libfcache-devel \
libfcache-devel(aarch-64) \
pkgconfig(libfcache)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfcache1"

inherit rpm
