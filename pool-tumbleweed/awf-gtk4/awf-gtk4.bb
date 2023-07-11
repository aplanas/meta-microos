SUMMARY = "Theme preview application for GTK 4"
DESCRIPTION = "A widget factory is a theme preview application for GTK. It displays the \
various widget types provided by GTK in a single window allowing to see \
the visual effect of the applied theme. \
 \
This package provides the GTK 4 version."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "awf-gtk4-2.7.0-2.1.aarch64.rpm"
RPM_HASH = "ca3cd28f66b1df8a98ab8703817adc223c08ae0c9d9c5234f2e76db8a73c16c0d4037df1c52933dd5f16f3fc5091f98d829c43f87ea1e511ccd33cb384ec64ca"

RPROVIDES:${PN} += "awf-gtk4"

RDEPENDS:${PN} += "gtk4 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
