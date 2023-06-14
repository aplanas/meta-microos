SUMMARY = "JavaScript Core Engine, GTK+ Port"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "libjavascriptcoregtk-4_1-0-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "600d9b7642966c36f457a3c17136bd2f8aaa27d60a7485b175db074bb28edd5a91ff8c6f89fb2c1ef8823e871121296365d65b703bdbcaa1bae152f2954e5fff"

RPROVIDES:${PN} += "libjavascriptcoregtk-4-1-0 \
libjavascriptcoregtk-4.1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
