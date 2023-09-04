SUMMARY = "Development files for libpff, a PFF/OFF file format library"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libpff."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230325"

RPM_NAME = "libpff-devel-20230325-2.1.aarch64.rpm"
RPM_HASH = "a3317b745435c28b60f6c2e6dcb569dee5878faf69a52ecbb17775d80fe0a078504f5a673bb400083170e5193ce16cd50d0fb01bbeace6724bc0bb5e26d8d324"

RPROVIDES:${PN} += "libpff-devel \
pkgconfig-libpff"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libpff1"

inherit rpm
