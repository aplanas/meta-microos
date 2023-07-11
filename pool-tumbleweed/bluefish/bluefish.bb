SUMMARY = "A feature-Rich HTML Editor"
DESCRIPTION = "Bluefish is a HTML editor designed for the experienced Web designer \
(supports HTML, PHP, Java, Perl, Python, Ruby, C, Pascal and more). \
 \
It is based on Gtk+."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.14"

RPM_NAME = "bluefish-2.2.14-1.1.aarch64.rpm"
RPM_HASH = "29a4d96a578646ca7eb578d6fd1882ae8df33dd4de86b63ed5305329b203c5c7b41a35c20ebea56043f384acf3ffa1376ccb9ca6a013a2d5303b4c59494cf6b6"

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
