SUMMARY = "A program for statistical analysis of sampled data"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
PSPP development is ongoing. It already supports a large subset of \
SPSS's syntax. Its statistical procedure support is currently \
limited, but growing. At your option, PSPP will produce statistical \
reports in ASCII, PostScript, PDF, HTML, SVG, or OpenDocument formats."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.2"

RPM_NAME = "pspp-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "66b47cd928e98d757decc2d42c1aec495b6754bf6c9e66ec538ca8391f5b6bf120ff6adfaa95f0431d9ef811dd0c1d4b2bf6af74a7278759f02e22639a9268e8"

RPROVIDES:${PN} += "config-pspp \
libpspp-1.6.2.so \
libpspp-core-1.6.2.so \
pspp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsl.so.27 \
libgslcblas.so.0 \
libgthread-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libreadline.so.8 \
libspread-sheet-widget.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
