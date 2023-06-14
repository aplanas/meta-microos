SUMMARY = "WebP support for graphviz"
DESCRIPTION = "The graphviz-webp package contains files needed for the support of WebP images"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-webp-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "cca459e733470ea82d80d437f108f08b205ca233080675f275d44780ebd937700d7b36a3bdfd657fb92690ce09ea56675dd841381f49daefa760e9c60a8ca8fd"

RPROVIDES:${PN} += "graphviz-webp \
libgvplugin-webp.so.6"

RDEPENDS:${PN} += "/bin/sh \
graphviz \
graphviz-gnome \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgvc.so.6 \
libwebp.so.7"

inherit rpm
