SUMMARY = "Development files for libfdatetime, a date and time data type library"
DESCRIPTION = "A library for date and time data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfdatetime."
LICENSE = "LGPL-3.0-or-later"

PV = "20220112"

RPM_NAME = "libfdatetime-devel-20220112-4.3.aarch64.rpm"
RPM_HASH = "917c603caa682f1ff0ccc20a1cfaabd13a7b6d6f6f21377037323fa1cb28575ac7f1436a2719c98e2da0e04a09c04fcc8009e68f6a554d9a656d27ed2abc4e61"

RPROVIDES:${PN} += "libfdatetime-devel \
pkgconfig-libfdatetime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdatetime1"

inherit rpm
