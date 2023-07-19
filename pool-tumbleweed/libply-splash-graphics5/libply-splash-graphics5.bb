SUMMARY = "Plymouth graphics libraries"
DESCRIPTION = "This package contains the libply-splash-graphics library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-graphics5-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "f9d3a47ef5464e7c43da08c6a79a8e069c046d632e43b76ef11f627ce903691bc2e6478067dd4b28d875d79834b354c081468ae420b70a3b39c67799b18529fe"

RPROVIDES:${PN} += "libply-splash-graphics.so.5 \
libply-splash-graphics5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply.so.5 \
libpng16.so.16"

inherit rpm
