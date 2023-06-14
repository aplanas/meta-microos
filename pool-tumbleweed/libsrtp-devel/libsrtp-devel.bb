SUMMARY = "Development files for the Secure Real-Time Transport Protocol (SRTP) library"
DESCRIPTION = "libsrtp is an implementation of the Secure Real-time Transport \
Protocol (SRTP) originally authored by Cisco Systems, Inc. \
 \
This subpackage contains the development headers."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libsrtp-devel-1.6.0-2.22.aarch64.rpm"
RPM_HASH = "cbcc73c67e8ab312b0c507666877fd00d3e57ebf515740c90e983824311a1a6f971617b2c91f7a0805f2c9ae3f2b5fea8d4566177222daa51b83acf20754fb1b"

RPROVIDES:${PN} += "libsrtp-devel \
pkgconfig-libsrtp \
srtp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrtp1"

inherit rpm
