SUMMARY = "X utility to display system load average"
DESCRIPTION = "xload displays a periodically updating histogram of the system load \
average."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "xload-1.1.4-1.6.aarch64.rpm"
RPM_HASH = "75716817bc70f32720b02ca65ca77112966475e4df3d246e2efa8af00be3b300e51e16fcc4aac527e953d43cefb23705be2c98578e1436aed691382028efae1a"

RPROVIDES:${PN} += "xload"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
