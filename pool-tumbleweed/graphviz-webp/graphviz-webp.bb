SUMMARY = "WebP support for graphviz"
DESCRIPTION = "The graphviz-webp package contains files needed for the support of WebP images"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-webp-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "bb5ab5a3e69592845e97686c3ef75026cf0d80c138757d647bfa2ac0916539218d957dca00434828de063fff1d146b9622f552d3cb039503b1b48a7480f3b5b9"

RPROVIDES:${PN} += "graphviz-webp \
libgvplugin-webp.so.6"

RDEPENDS:${PN} += "/usr/bin/sh \
graphviz \
graphviz-gnome \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgvc.so.6 \
libwebp.so.7"

inherit rpm
