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

RPM_NAME = "libpff-devel-20230325-1.7.aarch64.rpm"
RPM_HASH = "b40f5673985bb7d6d7e1f12e92e075a7b463e0c6b17f2a327e0367abdc0c92c6bc6ec51e85e2b691861118de63319e4e42eb2ce6a3c635afdab080019856b202"

RPROVIDES:${PN} += "libpff-devel \
pkgconfig-libpff"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libpff1"

inherit rpm
