SUMMARY = "A feature-Rich HTML Editor"
DESCRIPTION = "Bluefish is a HTML editor designed for the experienced Web designer \
(supports HTML, PHP, Java, Perl, Python, Ruby, C, Pascal and more). \
 \
It is based on Gtk+."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.13"

RPM_NAME = "bluefish-2.2.13-1.1.aarch64.rpm"
RPM_HASH = "328a193ea0445c8a975e4710606c34bebac3aa68992205c1c93995060ae6ca1eedf9d7a102b40f5f8e39abe4335c53137ca36a597f4e4d03cfc7c11292fe00c5"

RPROVIDES:${PN} += "application() \
application(bluefish.desktop) \
bluefish \
bluefish(aarch-64) \
bluefish-unstable \
metainfo() \
metainfo(bluefish.appdata.xml) \
mimehandler(application/x-bluefish-project) \
mimehandler(application/x-cgi) \
mimehandler(application/x-javascript) \
mimehandler(application/x-perl) \
mimehandler(application/x-php) \
mimehandler(application/x-python) \
mimehandler(application/xhtml+xml) \
mimehandler(text/css) \
mimehandler(text/html) \
mimehandler(text/javascript) \
mimehandler(text/mathml) \
mimehandler(text/x-chdr) \
mimehandler(text/x-csrc) \
mimehandler(text/x-dtd) \
mimehandler(text/x-java) \
mimehandler(text/x-javascript) \
mimehandler(text/x-perl) \
mimehandler(text/x-php) \
mimehandler(text/x-python) \
mimehandler(text/x-sql) \
mimehandler(text/xml)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libenchant-2.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgucharmap_2_90.so.7()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
sgml-skel"

inherit rpm
