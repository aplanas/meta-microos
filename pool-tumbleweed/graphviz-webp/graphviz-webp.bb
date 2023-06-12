SUMMARY = "WebP support for graphviz"
DESCRIPTION = "The graphviz-webp package contains files needed for the support of WebP images"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-webp-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "cca459e733470ea82d80d437f108f08b205ca233080675f275d44780ebd937700d7b36a3bdfd657fb92690ce09ea56675dd841381f49daefa760e9c60a8ca8fd"

RPROVIDES:${PN} += "graphviz-webp \
graphviz-webp(aarch-64) \
libgvplugin_webp.so.6()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
graphviz \
graphviz-gnome \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgvc.so.6()(64bit) \
libwebp.so.7()(64bit)"

inherit rpm
