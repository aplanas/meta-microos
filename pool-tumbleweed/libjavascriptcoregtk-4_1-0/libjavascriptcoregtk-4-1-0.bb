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

RPM_NAME = "libjavascriptcoregtk-4_1-0-2.40.5-1.1.aarch64.rpm"
RPM_HASH = "77f4842ee9f39b777fac3f44d0fcf7d781b0d84e1ae918646f62d8fe88838c269b4c46d5547a2df29b507590bc7344f64cfa3c9ec959064a3e5c0ab0f6a97a39"

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
