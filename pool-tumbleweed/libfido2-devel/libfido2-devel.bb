SUMMARY = "Development files for FIDO U2F and FIDO 2.0 protocols"
DESCRIPTION = "This package contains the header file needed to develop applications that \
use FIDO U2F and FIDO 2.0 protocols."
LICENSE = "BSD-2-Clause"

PV = "1.13.0"

RPM_NAME = "libfido2-devel-1.13.0-1.3.aarch64.rpm"
RPM_HASH = "b822cd02c9cc99e50f2180c0d9d3ff51b5d05e05510b57cdb8e4b60978c300aa057ce36df3e3a2aeaa3e1f01dbf72bf7d940d42f71f0b15ef43176a5ae5fd7c3"

RPROVIDES:${PN} += "libfido2-devel \
pkgconfig-libfido2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfido2-1 \
openssl-devel \
pkgconfig-libcrypto"

inherit rpm
