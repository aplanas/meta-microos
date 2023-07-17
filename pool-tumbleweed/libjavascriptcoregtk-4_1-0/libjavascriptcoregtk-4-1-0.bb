SUMMARY = "JavaScript Core Engine, GTK+ Port"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "libjavascriptcoregtk-4_1-0-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "1930988165930cb3eb08f05ae515f0c074565197533a2a4a33b81f616bca808ed3178c7db047cccee8f7eaa7abb6c4806b6bb8b065f005b037670a95a3eb3c27"

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
