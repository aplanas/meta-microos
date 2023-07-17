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

RPM_NAME = "libpff-devel-20230325-1.8.aarch64.rpm"
RPM_HASH = "3c1871b51fb99a81931c5f79ad7738e09952fe39aacc57295113d890d47e0f5e858f7efc911b42ed71233dbb61870b03f67336f2ce2f93e26c7f4aa3afc6de03"

RPROVIDES:${PN} += "libpff-devel \
pkgconfig-libpff"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libpff1"

inherit rpm
