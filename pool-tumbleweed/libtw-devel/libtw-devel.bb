SUMMARY = "Main library for twin"
DESCRIPTION = "Development files for twin main library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "libtw-devel-0.9.0+17-3.5.aarch64.rpm"
RPM_HASH = "7f23edc908d01c4a5843f7cf5147e3085d7b0568ceb1f5b7927e70dc0e497ef855d1e6f4bbac7dd8aaa21788da5361c56ae2c04271c07da49ecd0fbcac369e4e"

RPROVIDES:${PN} += "libTw-devel \
libtw-devel"

RDEPENDS:${PN} += "libtstl1 \
libtw1"

inherit rpm
