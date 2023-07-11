SUMMARY = "Development files for libsmraw, a (split) RAW image file library"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmraw."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw-devel-20230320-1.7.aarch64.rpm"
RPM_HASH = "51a70c2be65da572d28666b6ccc8b1eedc03d085298d1111524bb33461ec0ebec8c175725ab0d69e42fbc871e64a252913524e8b0f1d85ad8b697b6e2460789c"

RPROVIDES:${PN} += "libsmraw-devel \
pkgconfig-libsmraw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libsmraw1"

inherit rpm
