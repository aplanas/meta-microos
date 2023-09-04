SUMMARY = "Epiphany Search Provider for GNOME Shell"
DESCRIPTION = "Epiphany is a Web browser for the GNOME Desktop. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Web (epiphany)"
LICENSE = "GPL-3.0-or-later"

PV = "44.6"

RPM_NAME = "gnome-shell-search-provider-epiphany-44.6-1.1.aarch64.rpm"
RPM_HASH = "6b5d2f231b30044992cba44e64abfc3e05b897425b4d4331ef566bb2a3a0e2643df06b48127843808804098ba8dbf9ce556a4b68fc1bb7c2a53b2339d46faf26"

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
