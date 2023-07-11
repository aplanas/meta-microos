SUMMARY = "Development files for libuna, a library to support Unicode/ASCII conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libuna."
LICENSE = "LGPL-3.0-or-later"

PV = "20230702"

RPM_NAME = "libuna-mini-devel-20230702-1.1.aarch64.rpm"
RPM_HASH = "37c66b38a782cc6df177e5bba338da351143821bbcd72f58702a40357f817de72626e5161dbe6bbe4133960cea44e62ca291d21f6b69b9ca102fe5bfa112d7f6"

RPROVIDES:${PN} += "libuna-mini-devel \
pkgconfig-libuna"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuna1-mini"

inherit rpm
