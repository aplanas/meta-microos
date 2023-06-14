SUMMARY = "DjVu support for zathura using the djvulibre library"
DESCRIPTION = "The zathura-djvu plugin adds DjVu support to zathura by using the djvulibre library."
LICENSE = "Zlib"

PV = "0.2.9"

RPM_NAME = "zathura-plugin-djvu-0.2.9-1.16.aarch64.rpm"
RPM_HASH = "40249fcea5bb52dcf8262621b6dd8f9a2f05bf75200449d8021eb9ebef070329127ae8fbd51b035165259c6d2173f84b01385a702c8264a4c1904b260ce16558"

RPROVIDES:${PN} += "libdjvu.so \
zathura-djvu-plugin \
zathura-plugin-djvu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdjvulibre.so.21 \
libgirara-gtk3.so.3 \
libglib-2.0.so.0 \
zathura"

inherit rpm
