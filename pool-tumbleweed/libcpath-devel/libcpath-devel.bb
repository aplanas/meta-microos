SUMMARY = "Development files for libcpath, a C path library"
DESCRIPTION = "A library for C path functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcpath."
LICENSE = "LGPL-3.0-or-later"

PV = "20220108"

RPM_NAME = "libcpath-devel-20220108-4.5.aarch64.rpm"
RPM_HASH = "67502f52412b0f5c2b67ebf5c81bd5d8237d8057b412848304ecfb12e1877c7b71acfc7acee632186e24352900e2f13dc2da161f45bb2224f32a2d1d847d16f1"

RPROVIDES:${PN} += "libcpath-devel \
pkgconfig-libcpath"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpath1"

inherit rpm
