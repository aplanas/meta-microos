SUMMARY = "Development files for the Secure Real-Time Transport Protocol (SRTP) library"
DESCRIPTION = "libsrtp is an implementation of the Secure Real-time Transport \
Protocol (SRTP) originally authored by Cisco Systems, Inc. \
 \
This subpackage contains the development headers."
LICENSE = "BSD-3-Clause"

PV = "2.2.0~git.20210916"

RPM_NAME = "libsrtp2-linphone-devel-2.2.0~git.20210916-1.9.aarch64.rpm"
RPM_HASH = "795835efbe50fa9e7a8fa0a6e7bb69b2ca69f339b2a0678d332c7bee73b71940f4f62dbe762e943462b5d8a43b4a541aec13e00a1448ea9f35734d4afa1686e8"

RPROVIDES:${PN} += "libsrtp2-linphone-devel \
pkgconfig-libsrtp2-linphone"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrtp2-linphone1"

inherit rpm
