SUMMARY = "Development files for libuna, a library to support Unicode/ASCII conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libuna."
LICENSE = "LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "libuna-mini-devel-20230710-1.1.aarch64.rpm"
RPM_HASH = "9d0f28c51332d06133409b898c6bd0e479faa6e3667be7a69c6c19fe631f9ffabe8bc17e4ba1efca8d4e030c4b1e6d105be652e92d53dfe18c92987d66d17098"

RPROVIDES:${PN} += "libuna-mini-devel \
pkgconfig-libuna"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuna1-mini"

inherit rpm
