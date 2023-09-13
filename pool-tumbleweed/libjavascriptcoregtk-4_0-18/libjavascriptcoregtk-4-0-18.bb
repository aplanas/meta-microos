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

RPM_NAME = "libjavascriptcoregtk-4_0-18-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "198d628ac6330f9629cfe6549f1cc6d14b5e17b497a30a500faaf13700517bb73f5ed8c6f4ca568efe5dd808a804e9ba47bdf02ff1efd954a1d0e052c90793b7"

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
