SUMMARY = "JavaScript Core Engine, GTK+ Port"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "libjavascriptcoregtk-4_0-18-2.40.5-1.1.aarch64.rpm"
RPM_HASH = "337f8183b0f583db54766092d686d1bdd1a6fffd1215c3b79360ec49b9d1d7e1f932f518f3ba97e12bc1460298891da8f85f8d07adc5d1dc24256f832ed9c6a7"

RPROVIDES:${PN} += "libjavascriptcoregtk-4-0-18 \
libjavascriptcoregtk-4.0.so.18"

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
