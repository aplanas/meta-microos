SUMMARY = "Plymouth graphics libraries"
DESCRIPTION = "This package contains the libply-splash-graphics library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-graphics5-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "a8025218cc322b931392abbd0562f056d31f62fa1bccb490933722a732cdd731d81aeb3b79ff78853240d7763453a6e27a97ee9f24f042371b9d6c0d99386760"

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
