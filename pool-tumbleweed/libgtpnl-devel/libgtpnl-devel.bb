SUMMARY = "Development files for the GPRS tunnel config library"
DESCRIPTION = "libgtpnl wraps the genetlink-based GPRS tunnel configuration of the \
Linux kernel into a C API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libgtpnl."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "libgtpnl-devel-1.2.3-1.3.aarch64.rpm"
RPM_HASH = "78f44c930f3da88942b4aeec842cffb1b079f32b7ab972f5461cafcdc140640c09eb4b4a437afe963dc15f4183c09fa43db5fc2d98da091971d6d16bb71ba317"

RPROVIDES:${PN} += "libgtpnl-devel \
pkgconfig-libgtpnl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtpnl0"

inherit rpm
