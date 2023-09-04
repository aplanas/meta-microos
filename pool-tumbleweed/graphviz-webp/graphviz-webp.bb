SUMMARY = "WebP support for graphviz"
DESCRIPTION = "The graphviz-webp package contains files needed for the support of WebP images"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-webp-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "92e28b51bb29e5fe626c413ecafc292ace176d76a121faf41219ae1492165e7db7dd86cc9c94af72df62e5365199a2ba4044c89696a6a2a155527156f3e1ed3c"

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
