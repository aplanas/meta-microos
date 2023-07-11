SUMMARY = "Development files for the Secure Real-Time Transport Protocol (SRTP) library"
DESCRIPTION = "libsrtp is an implementation of the Secure Real-time Transport \
Protocol (SRTP) originally authored by Cisco Systems, Inc. \
 \
This subpackage contains the development headers."
LICENSE = "BSD-3-Clause"

PV = "2.2.0~git.20210916"

RPM_NAME = "libsrtp2-linphone-devel-2.2.0~git.20210916-1.10.aarch64.rpm"
RPM_HASH = "c18ceb7afc83e521004cbe6bd4e70a877af8ea1aeb069410113dd44e618e470cee1fc20c4c010a930c1564d5a6fbbf47d74ef14a40579b00c277c08d93c32676"

RPROVIDES:${PN} += "libsrtp2-linphone-devel \
pkgconfig-libsrtp2-linphone"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrtp2-linphone1"

inherit rpm
