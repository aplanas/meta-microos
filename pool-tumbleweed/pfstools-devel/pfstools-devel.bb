SUMMARY = "Development files for libpfs, a library for HDR image and video manipulation"
DESCRIPTION = "The pfstools package is a set of command line (and one GUI) programs \
for reading, writing, manipulating and viewing high-dynamic range \
(HDR) images and video frames. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libpfs."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-devel-2.2.0-3.16.aarch64.rpm"
RPM_HASH = "9fe123ab645c521db3cca3b17bbc877a107e0575e6d344b0a9bcac29ac9fd3544459afa9c0181668a44cb90c9d69364b6491cc4512ef00a17032377893473c6b"

RPROVIDES:${PN} += "pfstools-devel \
pkgconfig-pfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpfs2"

inherit rpm
