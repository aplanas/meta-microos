SUMMARY = "A program for statistical analysis of sampled data"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
PSPP development is ongoing. It already supports a large subset of \
SPSS's syntax. Its statistical procedure support is currently \
limited, but growing. At your option, PSPP will produce statistical \
reports in ASCII, PostScript, PDF, HTML, SVG, or OpenDocument formats."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "pspp-1.4.1-3.14.aarch64.rpm"
RPM_HASH = "4a015e706bb59ad090141e44995753653357dc0605b71b12ce6888f2fa86a5e106d9af2cb679981ae2c1cfab2b2578c116497597d583519d614fa35057223a6a"

RPROVIDES:${PN} += "config-pspp \
libpspp-1.4.1.so \
libpspp-core-1.4.1.so \
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
libgtksourceview-3.0.so.1 \
libharfbuzz.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libreadline.so.8 \
libspread-sheet-widget.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
