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

RPM_NAME = "libjavascriptcoregtk6_0-1-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "f66a3950b2816b2ac158613f8a7a9e643e8f3538bd7bbd2a857bb163e4f6e3343ced41b049a3f3b600985d8d415d7d0246aa6b49bd0abd6fcde9fde69ac68ce3"

RPROVIDES:${PN} += "libjavascriptcoregtk-6.0.so.1 \
libjavascriptcoregtk6-0-1"

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
