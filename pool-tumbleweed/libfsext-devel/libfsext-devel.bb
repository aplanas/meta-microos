SUMMARY = "Development files for libfsext, Extended File System (ext) library"
DESCRIPTION = "libfsext is a library to access the extended file system (ext) format.  see libfsext for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsext."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230603"

RPM_NAME = "libfsext-devel-20230603-1.5.aarch64.rpm"
RPM_HASH = "c2d8da5e86061e71408ea6a1c53af7cbb3a02b2eebbefa66c4e29339655b984fa3c7680fb2ac69f8a6101208cf1a473682912489e144b38b0fe595f8aa85577c"

RPROVIDES:${PN} += "libfsext-devel \
pkgconfig-libfsext"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsext1"

inherit rpm
