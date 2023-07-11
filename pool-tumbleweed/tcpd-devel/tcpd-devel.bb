SUMMARY = "Include Files and Libraries for the TCP wrapper library"
DESCRIPTION = "This package contains the library and header files, which are necessary \
to compile and link programs against the TCP wrapper library."
LICENSE = "BSD-3-Clause"

PV = "7.6"

RPM_NAME = "tcpd-devel-7.6-895.4.aarch64.rpm"
RPM_HASH = "93edc840e5076ea346606fb30a892e94db618d3359eb8c4b2115ca3a29cbe6fd4faf1add3a2d9c57c518a2357dac5027fa0e7a0f277f673b6cc0d9d9165e2d4b"

RPROVIDES:${PN} += "tcpd-devel"

RDEPENDS:${PN} += "glibc-devel \
libwrap0"

inherit rpm
