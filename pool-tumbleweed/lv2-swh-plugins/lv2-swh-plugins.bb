SUMMARY = "LV2 ports of LADSPA swh plugins"
DESCRIPTION = "This is an early experimental port of my LADSPA plugins to the LV2 \
specification, c.f. http://lv2plug.in/ . It is still quite early days, but most \
things should work as well or not as they did in LADSPA."
LICENSE = "GPL-3.0"

PV = "1.0.16"

RPM_NAME = "lv2-swh-plugins-1.0.16-2.17.aarch64.rpm"
RPM_HASH = "5f6906e777466c5abe95eff53f9cf9a2c7cc8bccdeeddc13b62ab7f2836a6d4040f289c51548777f4810e90dea15196a028ec728dc713bc636e51ac6e69d2fd5"

RPROVIDES:${PN} += "lv2-swh-plugins \
lv2-swh-plugins(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3f.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
lv2"

inherit rpm
