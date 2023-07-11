SUMMARY = "C++ API for the CoreSight Trace Decode library"
DESCRIPTION = "C++ API for the OpenCSD library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libopencsd1-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "74cf138e846801e0abf9ceba17a3acc17b432b92515eecc724dd72c98694bc9ca7829ce7f6bdd71f2dcc0dde6822418405914c9fa8d8d1672f90693a5bea2c1f"

RPROVIDES:${PN} += "libopencsd.so.1 \
libopencsd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
