SUMMARY = "GNOME Calculator -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Calculator."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-gnome-calculator-44.0-1.2.aarch64.rpm"
RPM_HASH = "8adb1dbdcfd5836098a8070664ee2967692938482dda4b2e846e1a925b1cf3134e91ca7e6fc845bab5e94e0b597bb5cba6d320efc24d15cb3819ec1f158fdec3"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-calculator"

RDEPENDS:${PN} += "gnome-calculator \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
