SUMMARY = "Tracker module player library"
DESCRIPTION = "DUMB is a module audio renderer library. \
It reads module files and outputs audio that can be dumped \
to the actual audio playback library. \
 \
This package contains the shared libraries for dumb."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "libdumb2-2.0.3-1.9.aarch64.rpm"
RPM_HASH = "da910582e180499f7d4ac89ed1a86632943a43944604ea2aa8c5745f962ddc442eda528477b5b3e3da167546a9894d36da5fa31724622cb0db4dd40077aaf842"

RPROVIDES:${PN} += "libdumb.so.2()(64bit) \
libdumb2 \
libdumb2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
