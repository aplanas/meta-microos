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

RPM_NAME = "libpff-devel-20230325-1.4.aarch64.rpm"
RPM_HASH = "2cf27d3b41ae7de496fb955075fa38e49fa387921c1c149406e79237d5c4f28dcb383382bdf513f878a5302e1203176ce2935e5e58e6b2ee4ee4aa625319258b"

RPROVIDES:${PN} += "libpff-devel \
libpff-devel(aarch-64) \
pkgconfig(libpff)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libpff1"

inherit rpm
