SUMMARY = "Main library for twin"
DESCRIPTION = "Development files for twin main library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "libtw-devel-0.9.0+17-3.6.aarch64.rpm"
RPM_HASH = "74e1c2250cdc9e54abf83f14e9d1c0668c4614066eccdc3aa0e05edb46a41a9fe7ca6ec397b32b02d864b5cec764d6799879a7e072d9e44511439ac4954eaca8"

RPROVIDES:${PN} += "libTw-devel \
libtw-devel"

RDEPENDS:${PN} += "libtstl1 \
libtw1"

inherit rpm
