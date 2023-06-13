SUMMARY = "LV2 port of the Airwindows plugins"
DESCRIPTION = " \
This is an LV2 port (by Hannes Braun) of the Airwindows plugins \
originally developed by Chris Johnson. \
 \
Right now, only 84 plugins (out of 329) have been ported to LV2."
LICENSE = "MIT"

PV = "18.0"

RPM_NAME = "lv2-airwindows-18.0-1.1.aarch64.rpm"
RPM_HASH = "66e67e57fff401947edb98e8ab04e00545a2b8c938a0fc127d55bad6d573de639365d8c8aa6c1106193c9d90cb9edb768d2cb5cdf39a3584f377351d6086766c"

RPROVIDES:${PN} += "lv2-airwindows \
lv2-airwindows(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
