SUMMARY = "An implementation of RFC 3454 (stringprep)"
DESCRIPTION = "This package contains an implementation of the stringprep library."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libwind0-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "0f54c4612d9a94aab28c9b8db636dcc32a933e0ecd44fcc9ff4c81145b9ed7bb25da76a96ef1a2f3f60706b440b729c5eb2103b01142053438964ab1a32f32bf"

RPROVIDES:${PN} += "libwind.so.0 \
libwind0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2"

inherit rpm
