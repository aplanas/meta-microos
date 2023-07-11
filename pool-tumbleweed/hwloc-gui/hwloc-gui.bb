SUMMARY = "Hwloc GUI tool"
DESCRIPTION = "Hwloc GUI visualization tool - requires X11"
LICENSE = "BSD-3-Clause"

PV = "2.9.1"

RPM_NAME = "hwloc-gui-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "a9bedd51865012a2f3d825542922c155a8a784c60ee20a24dc57dd349bd70a8c57fe76b039b4654e1e8d524bc29d86034996e01952930b76a71a8f0494bc616f"

RPROVIDES:${PN} += "hwloc-gui"

RDEPENDS:${PN} += "hwloc \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libhwloc.so.15 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
