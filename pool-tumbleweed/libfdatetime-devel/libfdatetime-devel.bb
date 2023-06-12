SUMMARY = "Development files for libfdatetime, a date and time data type library"
DESCRIPTION = "A library for date and time data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfdatetime."
LICENSE = "LGPL-3.0-or-later"

PV = "20220112"

RPM_NAME = "libfdatetime-devel-20220112-4.2.aarch64.rpm"
RPM_HASH = "aef0e0d21efa9b2d018f5b64552a8d4193700bf685d7e1607f864b25fbcddd235ee670b1e959d7c8d25ee53be4bb9d94a6e0f4a030280d08e090225a1104a705"

RPROVIDES:${PN} += "libfdatetime-devel \
libfdatetime-devel(aarch-64) \
pkgconfig(libfdatetime)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdatetime1"

inherit rpm
