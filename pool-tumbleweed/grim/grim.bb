SUMMARY = "Wayland compositor image grabber"
DESCRIPTION = "This tool can grab images from a Wayland compositor."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "grim-1.4.0-2.6.aarch64.rpm"
RPM_HASH = "f68b601ef547cc18dac6f4380cec8fc011526e441e20e5ac268fa710bed94d59c82123344e17b27c2aa9659ecada77e31e70e367488439181da9e36355f414a4"

RPROVIDES:${PN} += "grim \
grim(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpixman-1.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
