SUMMARY = "GNOME Calculator -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Calculator."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-gnome-calculator-44.0-1.1.aarch64.rpm"
RPM_HASH = "83302914555699d5dfd3f087060379173c78b45de143b1df0c07f109771cffb55c96bfa0df89412486b91b9acce2fbcf3cb2489eeec9d680d6b08ba5018ee777"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-calculator"

RDEPENDS:${PN} += "gnome-calculator \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
