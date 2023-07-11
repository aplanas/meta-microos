SUMMARY = "Development files for libbfoverlay"
DESCRIPTION = "libbfoverlay is a library to provide basic file overlay support. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbfoverlay."
LICENSE = "LGPL-3.0-or-later"

PV = "20210416"

RPM_NAME = "libbfoverlay-devel-20210416-3.4.aarch64.rpm"
RPM_HASH = "fee597756aea7e074bbf8f73360871432599ca1deebb95506e6fc27ed361a847f38467de9f3680fa1cbf7bae118ac112b67bf0553d98127339b9186205e7c971"

RPROVIDES:${PN} += "libbfoverlay-devel \
pkgconfig-libbfoverlay"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libbfoverlay1"

inherit rpm
