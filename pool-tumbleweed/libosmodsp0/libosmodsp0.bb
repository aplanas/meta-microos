SUMMARY = "SDR DSP primitives"
DESCRIPTION = "A library with SDR DSP primitives"
LICENSE = "GPL-2.0-only"

PV = "0.4.0"

RPM_NAME = "libosmodsp0-0.4.0-1.18.aarch64.rpm"
RPM_HASH = "e905dd789fb2b985909c678f9eb202cc4bc27555205c9e1b568738e20bf14890073584243546275cb91505ad69c1b28f1a625b7fcd508bc2531a8e5538ad757c"

RPROVIDES:${PN} += "libosmodsp.so.0()(64bit) \
libosmodsp0 \
libosmodsp0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libfftw3f.so.3()(64bit)"

inherit rpm
