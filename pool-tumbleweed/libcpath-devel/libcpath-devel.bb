SUMMARY = "Development files for libcpath, a C path library"
DESCRIPTION = "A library for C path functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcpath."
LICENSE = "LGPL-3.0-or-later"

PV = "20220108"

RPM_NAME = "libcpath-devel-20220108-4.3.aarch64.rpm"
RPM_HASH = "83cbb0141e9e2d1cd0ff0548467fdac6f33a6c593971e036d9ff68b58776beaaae8b11f69a1ff075d52bcc7141f267abc933ea11fb56b31dfe092fc4cfeedb27"

RPROVIDES:${PN} += "libcpath-devel \
pkgconfig-libcpath"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpath1"

inherit rpm
