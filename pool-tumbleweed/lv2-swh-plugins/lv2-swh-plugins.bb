SUMMARY = "LV2 ports of LADSPA swh plugins"
DESCRIPTION = "This is an early experimental port of my LADSPA plugins to the LV2 \
specification, c.f. http://lv2plug.in/ . It is still quite early days, but most \
things should work as well or not as they did in LADSPA."
LICENSE = "GPL-3.0"

PV = "1.0.16"

RPM_NAME = "lv2-swh-plugins-1.0.16-2.18.aarch64.rpm"
RPM_HASH = "07f982e46b54dd27fac1720762690854fb3e80b594db86a7929d0d239638c6283529ef0ed944a0bbd6bb2a0b6bd2c59930eb6f5f1fc99ccb7f9ddae3ababd263"

RPROVIDES:${PN} += "lv2-swh-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6 \
lv2"

inherit rpm
