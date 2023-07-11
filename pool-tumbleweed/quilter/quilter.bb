SUMMARY = "Writing application"
DESCRIPTION = "A fullscreen word processor for Elementary OS."
LICENSE = "GPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "quilter-3.3.4-1.12.aarch64.rpm"
RPM_HASH = "758d233c4f61667ef06a44837e5dceb277353b3434f6f647aa22471f9acc6a60a2258321a660381e484ad7477551ce71c15f4c70057f2bc00c54d7c1f75dce5e"

RPROVIDES:${PN} += "quilter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libgtkspell3-3.so.0 \
libhandy-1.so.0 \
libmarkdown.so.3 \
libwebkit2gtk-4.0.so.37"

inherit rpm
