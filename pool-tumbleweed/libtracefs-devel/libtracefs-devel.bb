SUMMARY = "Development files for libtracefs"
DESCRIPTION = "This library provides C APIs to access the kernel trace file system. \
 \
This subpackage contains the header files."
LICENSE = "LGPL-2.1-only"

PV = "1.7.0"

RPM_NAME = "libtracefs-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "40cf81d9675ac21fc9fd33184c3c4b262066a8d8efb61909782200f23d798013247de9b785c5e598edc024278df5e48ba55962c612061bfedd75f26ea1a13dd1"

RPROVIDES:${PN} += "libtracefs-devel \
pkgconfig-libtracefs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtracefs1 \
pkgconfig-libtraceevent"

inherit rpm
