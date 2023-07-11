SUMMARY = "Industrial I/O library -- iiod"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains the iiod daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "libiio-daemon-0.24-1.5.aarch64.rpm"
RPM_HASH = "fb1fc4dace61e9932c41872b74c989109cc0011bda51e2089fdfc14fee75c6043b52a0e86753f91254134598fe1a5ec576a3327cb8e455cab2f97fa9d1662287"

RPROVIDES:${PN} += "libiio-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libiio.so.0"

inherit rpm
