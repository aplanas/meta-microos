SUMMARY = "Development files for libuna, a library to support Unicode/ASCII conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libuna."
LICENSE = "LGPL-3.0-or-later"

PV = "20220611"

RPM_NAME = "libuna-mini-devel-20220611-4.2.aarch64.rpm"
RPM_HASH = "23248227386d77be4df8d4d25c9137a32d4ab235fcc6c6ef2f76902e0cc926e274f58d07c5728f44536fc09fd03b585d81a3345f35929565cb4bd79b8a8599da"

RPROVIDES:${PN} += "libuna-mini-devel \
libuna-mini-devel(aarch-64) \
pkgconfig(libuna)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuna1-mini"

inherit rpm
