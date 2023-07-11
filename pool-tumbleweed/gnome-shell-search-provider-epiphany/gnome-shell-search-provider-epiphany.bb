SUMMARY = "Epiphany Search Provider for GNOME Shell"
DESCRIPTION = "Epiphany is a Web browser for the GNOME Desktop. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Web (epiphany)"
LICENSE = "GPL-3.0-or-later"

PV = "44.5"

RPM_NAME = "gnome-shell-search-provider-epiphany-44.5-1.1.aarch64.rpm"
RPM_HASH = "a155cb12326c346badb51fc5dbb4f4ad7b1c9adc2358f32ac45be797b1ac93eadcf76dad187232238ad5e9a3c35d66a2bb87daf433557a3ae67e7711e133f81f"

RPROVIDES:${PN} += "gnome-shell-search-provider-epiphany"

RDEPENDS:${PN} += "epiphany \
gnome-shell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libephymain.so \
libephymisc.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
