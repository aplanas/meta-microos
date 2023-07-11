SUMMARY = "Development files for the GPRS tunnel config library"
DESCRIPTION = "libgtpnl wraps the genetlink-based GPRS tunnel configuration of the \
Linux kernel into a C API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libgtpnl."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.2.4"

RPM_NAME = "libgtpnl-devel-1.2.4-1.1.aarch64.rpm"
RPM_HASH = "9de9b24d16c4e4454d53bdbefeec0127b1b3c9de25d12429d62075e184d58fc9a2c8c7ddbc41f1b0199819bc35da0916d2c7495013ad19d1055d349aecb5683d"

RPROVIDES:${PN} += "libgtpnl-devel \
pkgconfig-libgtpnl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtpnl0"

inherit rpm
