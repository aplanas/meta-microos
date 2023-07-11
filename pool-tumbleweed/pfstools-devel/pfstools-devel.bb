SUMMARY = "Development files for libpfs, a library for HDR image and video manipulation"
DESCRIPTION = "The pfstools package is a set of command line (and one GUI) programs \
for reading, writing, manipulating and viewing high-dynamic range \
(HDR) images and video frames. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libpfs."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-devel-2.2.0-3.15.aarch64.rpm"
RPM_HASH = "36359fd2942f7a6418dc5b932c36429efa7d231ddf50ec1dcbc0321c871db74aeb5de60e4eee2df0d8a861f7112011bfcd6750260de398244cf78596e523b7d0"

RPROVIDES:${PN} += "pfstools-devel \
pkgconfig-pfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpfs2"

inherit rpm
