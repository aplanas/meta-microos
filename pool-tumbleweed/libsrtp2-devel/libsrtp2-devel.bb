SUMMARY = "Development files for the Secure Real-Time Transport Protocol (SRTP) library v2"
DESCRIPTION = "libsrtp is Cisco's implementation of the Secure Real-time Transport \
Protocol (SRTP), the Universal Security Transform (UST), and a \
supporting cryptographic kernel. \
 \
This subpackage contains the development headers."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "libsrtp2-devel-2.5.0-2.1.aarch64.rpm"
RPM_HASH = "7a11552f7bc2c9021413e007651ba5e480f8ad0c408cf5ed933b43b7e20e7b3a23936746c2a8dd401b2f02d9d630d591ea46fad4189c107280d38249fda5515c"

RPROVIDES:${PN} += "libsrtp2-devel \
libsrtp2-devel(aarch-64) \
pkgconfig(libsrtp2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrtp2-1"

inherit rpm
