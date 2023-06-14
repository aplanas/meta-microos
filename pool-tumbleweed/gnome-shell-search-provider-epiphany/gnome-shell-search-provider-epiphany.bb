SUMMARY = "Epiphany Search Provider for GNOME Shell"
DESCRIPTION = "Epiphany is a Web browser for the GNOME Desktop. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Web (epiphany)"
LICENSE = "GPL-3.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-shell-search-provider-epiphany-44.3-1.1.aarch64.rpm"
RPM_HASH = "694187d2ddb59fe61ef3c477e772b894154acd7678d802c11adfab363714fa9744db9128bbe94a03a76f1ef52b2120eafe4cfbf93208f6c20115570baf69d3fa"

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
