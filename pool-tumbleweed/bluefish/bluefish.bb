SUMMARY = "A feature-Rich HTML Editor"
DESCRIPTION = "Bluefish is a HTML editor designed for the experienced Web designer \
(supports HTML, PHP, Java, Perl, Python, Ruby, C, Pascal and more). \
 \
It is based on Gtk+."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.13"

RPM_NAME = "bluefish-2.2.13-1.1.aarch64.rpm"
RPM_HASH = "328a193ea0445c8a975e4710606c34bebac3aa68992205c1c93995060ae6ca1eedf9d7a102b40f5f8e39abe4335c53137ca36a597f4e4d03cfc7c11292fe00c5"

RPROVIDES:${PN} += "bluefish \
bluefish-unstable"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libenchant-2.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgucharmap-2-90.so.7 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2 \
sgml-skel"

inherit rpm
