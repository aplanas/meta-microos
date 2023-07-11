SUMMARY = "Development files for libfcache"
DESCRIPTION = "Library to provide generic file data cache functions for the libyal family of libraries. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfcache."
LICENSE = "LGPL-3.0-or-later"

PV = "20230115"

RPM_NAME = "libfcache-devel-20230115-1.3.aarch64.rpm"
RPM_HASH = "dac4dd6923b5554f14369fc22b2af8b1c4c5c4a21dae4912e2711f97382a90151149277e86d463bee5af0e2e6389f194d5600cde38403320262df74d25ed919b"

RPROVIDES:${PN} += "libfcache-devel \
pkgconfig-libfcache"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfcache1"

inherit rpm
