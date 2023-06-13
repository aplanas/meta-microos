SUMMARY = "Development files for libbfoverlay"
DESCRIPTION = "libbfoverlay is a library to provide basic file overlay support. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbfoverlay."
LICENSE = "LGPL-3.0-or-later"

PV = "20210416"

RPM_NAME = "libbfoverlay-devel-20210416-3.3.aarch64.rpm"
RPM_HASH = "f50d3f1fd4309d31e1e3395b7fa47acff72b57cb817c3774863fb26b6055ea5d1da81b970b63e7cbd4642885fe5b247a941807a1672215b139ee8083740ce164"

RPROVIDES:${PN} += "libbfoverlay-devel \
libbfoverlay-devel(aarch-64) \
pkgconfig(libbfoverlay)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libbfoverlay1"

inherit rpm
